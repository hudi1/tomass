package it.finalStanding;

import java.util.List;

import net.sf.lightair.LightAirSpringRunner;
import net.sf.lightair.annotation.Setup;
import net.sf.lightair.annotation.Verify;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.tahom.processor.service.finalStanding.FinalStandingService;
import org.tahom.repository.model.FinalStanding;
import org.tahom.repository.model.FinalStanding.Association;
import org.tahom.repository.model.Participant;

@RunWith(LightAirSpringRunner.class)
@ContextConfiguration(locations = { "/spring/application-context-test.xml" })
@Setup.List({ @Setup("../clear-all.xml"), @Setup() })
public class FinalStandingIT {

    @Autowired
    private FinalStandingService finalStandingService;

    @Test
    @Verify("createFinalStandingTest-verify.xml")
    public void createFinalStandingTest() throws Exception {
        FinalStanding tournament = finalStandingService.createFinalStanding(createDefaultFinalStanding());
        Assert.assertNotNull(tournament.getId());
    }

    @Test
    @Verify("deleteFinalStandingTest-verify.xml")
    public void deleteFinalStandingTest() throws Exception {
        int count = finalStandingService.deleteFinalStanding(new FinalStanding()._setId(1));
        Assert.assertNotSame(0, count);
    }

    @Test
    @Verify("getFinalStandingTest-verify.xml")
    public void getFinalStandingTest() throws Exception {
        FinalStanding tournament = finalStandingService.getFinalStanding(1);
        Assert.assertNotNull(tournament);
    }

    @Test
    @Verify("getFinalStandingTest-verify.xml")
    public void listFinalStandingTest() throws Exception {
        List<FinalStanding> tournaments = finalStandingService.listFinalStanding(new FinalStanding()
                ._setInit_(Association.values()));
        Assert.assertSame(1, tournaments.size());
    }

    @Test
    @Verify("updateFinalStandingTest-verify.xml")
    public void updateFinalStandingTest() throws Exception {
        int count = finalStandingService.updateFinalStanding(createUpdatedFinalStanding(1));
        Assert.assertNotSame(0, count);
    }

    private FinalStanding createDefaultFinalStanding() {
        FinalStanding finalStanding = new FinalStanding();
        finalStanding.setFinalRank(2);
        finalStanding.setParticipant(new Participant()._setId(2));
        return finalStanding;
    }

    private FinalStanding createUpdatedFinalStanding(Integer finalStandingId) {
        FinalStanding finalStanding = new FinalStanding();
        finalStanding.setId(finalStandingId);
        finalStanding.setFinalRank(11);
        finalStanding.setParticipant(new Participant()._setId(2));
        return finalStanding;
    }

}
