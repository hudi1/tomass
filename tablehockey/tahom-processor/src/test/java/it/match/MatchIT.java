package it.match;

import java.util.List;

import net.sf.lightair.LightAirSpringRunner;
import net.sf.lightair.annotation.Setup;
import net.sf.lightair.annotation.Verify;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.tahom.processor.service.match.MatchService;
import org.tahom.repository.model.Game;
import org.tahom.repository.model.Groups;
import org.tahom.repository.model.Matchs;
import org.tahom.repository.model.Matchs.Association;
import org.tahom.repository.model.Player;

@RunWith(LightAirSpringRunner.class)
@ContextConfiguration(locations = { "/spring/application-context-test.xml" })
@Setup.List({ @Setup("../clear-all.xml"), @Setup() })
public class MatchIT {

    @Autowired
    private MatchService matchService;

    @Test
    @Verify("createMatchTest-verify.xml")
    public void createMatchsTest() throws Exception {
        Matchs tournament = matchService.createMatch(createDefaultMatch());
        Assert.assertNotNull(tournament.getId());
    }

    @Test
    @Verify("deleteMatchTest-verify.xml")
    public void deleteMatchsTest() throws Exception {
        int count = matchService.deleteMatch(new Matchs()._setId(1));
        Assert.assertNotSame(0, count);
    }

    @Test
    @Verify("getMatchTest-verify.xml")
    public void getMatchsTest() throws Exception {
        Matchs tournament = matchService.getMatch(1);
        Assert.assertNotNull(tournament);
    }

    @Test
    @Verify("getMatchTest-verify.xml")
    public void listMatchsTest() throws Exception {
        List<Matchs> tournaments = matchService.listMatchs(new Matchs()._setInit_(Association.values()));
        Assert.assertSame(1, tournaments.size());
    }

    @Test
    @Verify("updateMatchTest-verify.xml")
    public void updateMatchsTest() throws Exception {
        int count = matchService.updateMatch(createUpdatedMatchs(1));
        Assert.assertNotSame(0, count);
    }

    private Matchs createDefaultMatch() {
        Matchs match = new Matchs();
        match.setAwayPlayer(new Player()._setId(1));
        match.setGame(new Game()._setId(2));
        match.setGroup(new Groups()._setId(2));
        match.setHockey(2);
        match.setHomePlayer(new Player()._setId(2));
        match.setRound(2);
        return match;
    }

    private Matchs createUpdatedMatchs(Integer matchId) {
        Matchs match = new Matchs();
        match.setId(matchId);
        match.setAwayPlayer(new Player()._setId(1));
        match.setGame(new Game()._setId(2));
        match.setGroup(new Groups()._setId(2));
        match.setHockey(2);
        match.setHomePlayer(new Player()._setId(2));
        match.setRound(2);
        return match;
    }

}
