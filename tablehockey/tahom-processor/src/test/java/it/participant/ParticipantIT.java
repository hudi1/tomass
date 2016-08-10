package it.participant;

import java.util.List;

import net.sf.lightair.LightAirSpringRunner;
import net.sf.lightair.annotation.Setup;
import net.sf.lightair.annotation.Verify;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.tahom.processor.service.participant.ParticipantService;
import org.tahom.repository.model.Participant;
import org.tahom.repository.model.Participant.Association;
import org.tahom.repository.model.Player;
import org.tahom.repository.model.Tournament;

@RunWith(LightAirSpringRunner.class)
@ContextConfiguration(locations = { "/spring/application-context-test.xml" })
@Setup.List({ @Setup("../clear-all.xml"), @Setup() })
public class ParticipantIT {

    @Autowired
    private ParticipantService participantService;

    @Test
    @Verify("createParticipantTest-verify.xml")
    public void createParticipantTest() {
        Participant participant = participantService.createParticipant(createDefaultParticipant());
        Assert.assertNotNull(participant.getId());
    }

    @Test
    @Verify("deleteParticipantTest-verify.xml")
    public void deleteParticipantTest() {
        int count = participantService.deleteParticipant(new Participant()._setId(1));
        Assert.assertSame(1, count);
    }

    @Test
    @Verify("getParticipantTest-verify.xml")
    public void getAllParticipantsTest() throws Exception {
        List<Participant> players = participantService.listParticipants(new Participant()._setInit_(Association
                .values()));
        Assert.assertSame(1, players.size());
    }

    private Participant createDefaultParticipant() {
        Participant participant = new Participant();
        participant.setPlayer(new Player()._setId(2));
        participant.setTournament(new Tournament()._setId(1));
        return participant;
    }

}
