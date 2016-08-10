package org.tahom.processor.service.schedule;

import org.tahom.processor.schedule.AdvancedRoundRobinSchedule;
import org.tahom.processor.schedule.BalancedRoundRobinSchedule;
import org.tahom.processor.schedule.CyclicRoundRobinSchedule;
import org.tahom.processor.schedule.RoundRobinSchedule;
import org.tahom.processor.service.schedule.dto.ScheduleDto;

public class ScheduleFactory {

    public static RoundRobinSchedule getRoundRobinSchedule(ScheduleDto scheduleDto) {

        // TODO include add another schedule
        RoundRobinSchedule schedule = null;
        if (scheduleDto.getGroup().getStage().getCopyResultStage() == null) {
            if (scheduleDto.getGroup().getGroupParticipants().size() % 2 == 0) {
                schedule = new BalancedRoundRobinSchedule(scheduleDto);
            } else {
                schedule = new CyclicRoundRobinSchedule(scheduleDto);
            }
        } else {
            schedule = new AdvancedRoundRobinSchedule(scheduleDto);
        }

        return schedule;
    }

}
