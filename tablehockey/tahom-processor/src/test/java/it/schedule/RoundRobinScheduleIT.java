package it.schedule;

import jdk.nashorn.internal.ir.annotations.Ignore;
import net.sf.lightair.LightAirSpringRunner;
import net.sf.lightair.annotation.Setup;
import net.sf.lightair.annotation.Verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.tahom.processor.service.participant.GroupParticipantService;
import org.tahom.processor.service.schedule.ScheduleService;
import org.tahom.processor.service.schedule.dto.ScheduleDto;
import org.tahom.repository.model.Groups;
import org.tahom.repository.model.Stage;

@Ignore
@RunWith(LightAirSpringRunner.class)
@ContextConfiguration(locations = { "/spring/application-context-test.xml" })
@Setup.List({ @Setup("../clear-all.xml"), @Setup() })
public class RoundRobinScheduleIT {

    @Autowired
    private GroupParticipantService groupParticipantService;

    @Autowired
    private ScheduleService scheduleService;

    @Test
    @Verify("createBalancedScheduleTest-verify.xml")
    public void createBalancedScheduleTest() {
        scheduleService.createSchedule(createDto(new Groups()._setId(1)));
    }

    @Test
    @Verify("createCyclicScheduleTest-verify.xml")
    public void createCyclicScheduleTest() {
        scheduleService.createSchedule(createDto(new Groups()._setId(2)));
    }

    private ScheduleDto createDto(Groups group) {
        ScheduleDto dto = new ScheduleDto();
        dto.setGroup(group);
        group.setStage(new Stage()._setId(1));
        return dto;
    }

}
