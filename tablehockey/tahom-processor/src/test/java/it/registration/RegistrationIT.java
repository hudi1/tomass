package it.registration;

import java.util.Arrays;
import java.util.List;

import net.sf.lightair.LightAirSpringRunner;
import net.sf.lightair.annotation.Setup;
import net.sf.lightair.annotation.Verify;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.tahom.processor.service.registration.RegistrationService;
import org.tahom.repository.model.Groups;
import org.tahom.repository.model.Participant;
import org.tahom.repository.model.Player;
import org.tahom.repository.model.Tournament;

@RunWith(LightAirSpringRunner.class)
@ContextConfiguration(locations = { "/spring/application-context-test.xml" })
@Setup.List({ @Setup("../clear-all.xml"), @Setup() })
public class RegistrationIT {

    @Autowired
    private RegistrationService registrationService;

    @Test
    @Verify("registerParticipant-verify.xml")
    public void registerParticipantTest() {
        registrationService.registerParticipant(new Player()._setId(5), new Tournament()._setId(1));
    }

    @Test
    @Verify("registerParticipant-verify.xml")
    @Ignore("TODO Exception handling")
    public void registerParticipantErrorTest() {
        registrationService.registerParticipant(new Player()._setId(1), new Tournament()._setId(1));
    }

    @Test
    @Verify("registerGroupParticipants-verify.xml")
    public void registerGroupParticipants() {
        List<Participant> participants = Arrays.asList(new Participant()._setId(1), new Participant()._setId(2),
                new Participant()._setId(3), new Participant()._setId(4));
        registrationService.registerGroupParticipants(participants, new Groups()._setId(1));
    }

}
