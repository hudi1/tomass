package org.tahom.processor.service.schedule;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.tahom.processor.schedule.RoundRobinSchedule;
import org.tahom.processor.service.match.MatchService;
import org.tahom.processor.service.participant.GroupParticipantService;
import org.tahom.processor.service.schedule.dto.ScheduleDto;
import org.tahom.repository.model.GroupParticipant;
import org.tahom.repository.model.GroupParticipant.Association;
import org.tahom.repository.model.Matchs;

public class ScheduleService {

    @Autowired
    private GroupParticipantService groupParticipantService;

    @Autowired
    private MatchService matchService;

    public List<Matchs> createSchedule(ScheduleDto scheduleDto) {
        List<GroupParticipant> participants = groupParticipantService.listGroupParticipants(new GroupParticipant()
                ._setGroup(scheduleDto.getGroup())._setInit_(Association.values()));
        scheduleDto.getGroup().setGroupParticipants(participants);

        RoundRobinSchedule schedule = ScheduleFactory.getRoundRobinSchedule(scheduleDto);
        List<Matchs> matches = schedule.createSchedule();
        for (Matchs matchs : matches) {
            matchService.createMatch(matchs);
        }
        return matches;
    }
}
