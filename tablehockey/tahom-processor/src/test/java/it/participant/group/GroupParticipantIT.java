package it.participant.group;

import java.util.List;

import net.sf.lightair.LightAirSpringRunner;
import net.sf.lightair.annotation.Setup;
import net.sf.lightair.annotation.Verify;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.tahom.processor.service.participant.GroupParticipantService;
import org.tahom.repository.model.GroupParticipant;
import org.tahom.repository.model.GroupParticipant.Association;
import org.tahom.repository.model.Groups;
import org.tahom.repository.model.Participant;
import org.tahom.repository.type.model.Score;

@RunWith(LightAirSpringRunner.class)
@ContextConfiguration(locations = { "/spring/application-context-test.xml" })
@Setup.List({ @Setup("../../clear-all.xml"), @Setup() })
public class GroupParticipantIT {

    @Autowired
    private GroupParticipantService participantService;

    @Test
    @Verify("createGroupParticipantTest-verify.xml")
    public void createParticipantTest() {
        GroupParticipant participant = participantService.createGroupParticipant(createDefaultGroupParticipant());
        Assert.assertNotNull(participant.getId());
    }

    @Test
    @Verify("deleteGroupParticipantTest-verify.xml")
    public void deleteParticipantTest() {
        int count = participantService.deleteGroupParticipant(new GroupParticipant()._setId(1));
        Assert.assertSame(1, count);
    }

    @Test
    @Verify("updateGroupParticipantTest-verify.xml")
    public void updateParticipantTest() {
        int count = participantService.updateGroupParticipant(createUpdatedGroupParticipant(1));
        Assert.assertSame(1, count);
    }

    @Test
    @Verify("getGroupParticipantTest-verify.xml")
    public void getParticipantsTest() throws Exception {
        GroupParticipant participant = participantService.getGroupParticipant(1);
        Assert.assertNotNull(participant);
    }

    @Test
    @Verify("getGroupParticipantTest-verify.xml")
    public void getAllParticipantsTest() throws Exception {
        List<GroupParticipant> participants = participantService.listGroupParticipants(new GroupParticipant()
                ._setInit_(Association.values()));
        Assert.assertSame(1, participants.size());
    }

    private GroupParticipant createDefaultGroupParticipant() {
        GroupParticipant groupParticipant = new GroupParticipant();
        groupParticipant.setGroup(new Groups()._setId(1));
        groupParticipant.setPoints(1);
        groupParticipant.setRank(1);
        groupParticipant.setScore(new Score(1, 1));
        groupParticipant.setSecondaryRank(1);
        groupParticipant.setParticipant(new Participant()._setId(1));
        return groupParticipant;
    }

    private GroupParticipant createUpdatedGroupParticipant(Integer participantId) {
        GroupParticipant groupParticipant = new GroupParticipant();
        groupParticipant.setId(participantId);
        groupParticipant.setGroup(new Groups()._setId(1));
        groupParticipant.setPoints(2);
        groupParticipant.setRank(2);
        groupParticipant.setScore(new Score(2, 2));
        groupParticipant.setSecondaryRank(2);
        groupParticipant.setParticipant(new Participant()._setId(1));
        return groupParticipant;
    }
}
