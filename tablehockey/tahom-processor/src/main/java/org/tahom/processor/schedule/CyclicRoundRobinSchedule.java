package org.tahom.processor.schedule;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.tahom.processor.service.schedule.dto.ScheduleDto;
import org.tahom.repository.model.GroupParticipant;
import org.tahom.repository.model.Matchs;

public class CyclicRoundRobinSchedule extends RoundRobinSchedule {

    private final List<GroupParticipant> participants;
    private Integer rounds;
    private Integer actualRound;
    private Integer actualHockey;
    private Integer startHockey;;
    private List<Matchs> schedule;

    public CyclicRoundRobinSchedule(ScheduleDto scheduleDto) {
        this.participants = scheduleDto.getGroup().getGroupParticipants();
        this.rounds = participants.size();
        this.startHockey = scheduleDto.getStartHockey();
        this.schedule = new ArrayList<>();
        resetHockey();
    }

    public List<Matchs> createSchedule() {
        if (!schedule.isEmpty()) {
            return schedule;
        }

        if (participants.size() % 2 == 0) {
            // TODO Exception handling
            throw new RuntimeException();
        }

        for (int i = 0; i < rounds; i++) {
            actualRound = i + 1;
            LinkedList<GroupParticipant> roundparticipants = prepareParticipants(participants);
            while (!roundparticipants.isEmpty()) {
                Matchs match = createMatch(roundparticipants.removeFirst(), roundparticipants.removeLast());
                if (match != null) {
                    schedule.add(match);
                    actualHockey++;
                }
            }
            resetHockey();
            Collections.rotate(participants, 1);
        }
        return schedule;
    }

    private LinkedList<GroupParticipant> prepareParticipants(List<GroupParticipant> originalParticipants) {
        LinkedList<GroupParticipant> participants = new LinkedList<>(originalParticipants);
        participants.addFirst(new GroupParticipant()._setTemp(true));
        return participants;
    }

    private void resetHockey() {
        actualHockey = startHockey;
    }

    @Override
    protected Integer getRound() {
        return actualRound;
    }

    @Override
    protected Integer getHockey() {
        return actualHockey;
    }
}
