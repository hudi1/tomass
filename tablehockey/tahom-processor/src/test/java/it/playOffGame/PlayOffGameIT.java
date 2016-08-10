package it.playOffGame;

import java.util.List;

import net.sf.lightair.LightAirSpringRunner;
import net.sf.lightair.annotation.Setup;
import net.sf.lightair.annotation.Verify;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.tahom.processor.service.playOffGame.PlayOffGameService;
import org.tahom.repository.model.GameStatus;
import org.tahom.repository.model.Participant;
import org.tahom.repository.model.PlayOffGame;
import org.tahom.repository.model.Stage;
import org.tahom.repository.type.model.Results;

@RunWith(LightAirSpringRunner.class)
@ContextConfiguration(locations = { "/spring/application-context-test.xml" })
@Setup.List({ @Setup("../clear-all.xml"), @Setup() })
public class PlayOffGameIT {

    @Autowired
    private PlayOffGameService playOffGameService;

    @Test
    @Verify("createPlayOffGameTest-verify.xml")
    public void createPlayOffGameTest() {
        PlayOffGame playOffGame = playOffGameService.createPlayOffGame(createDefaultPlayOffGame());
        Assert.assertNotNull(playOffGame.getId());
    }

    @Test
    @Verify("deletePlayOffGameTest-verify.xml")
    public void deletePlayOffGameTest() {
        int count = playOffGameService.deletePlayOffGame(new PlayOffGame()._setId(1));
        Assert.assertNotSame(0, count);
    }

    @Test
    @Verify("updatePlayOffGameTest-verify.xml")
    public void updatePlayOffGameTest() {
        int count = playOffGameService.updatePlayOffGame(createUpdatedPlayOffGame(1));
        Assert.assertNotSame(0, count);
    }

    @Test
    @Verify("getPlayOffGameTest-verify.xml")
    public void getPlayOffGameTest() {
        PlayOffGame playOffGame = playOffGameService.getPlayOffGame(new PlayOffGame()._setId(1));
        Assert.assertNotNull(playOffGame);
    }

    @Test
    @Verify("getPlayOffGameTest-verify.xml")
    public void getPlayOffGamesTest() {
        List<PlayOffGame> playOffGames = playOffGameService.getPlayOffGames(new PlayOffGame()._setStage(new Stage()
                ._setId(1)));
        Assert.assertSame(1, playOffGames.size());
    }

    public PlayOffGame createDefaultPlayOffGame() {
        PlayOffGame playOffGame = new PlayOffGame();
        playOffGame.setAwayParticipant(new Participant()._setId(1));
        playOffGame.setHomeParticipant(new Participant()._setId(2));
        playOffGame.setPosition(2);
        playOffGame.setResult(new Results("0:1"));
        playOffGame.setStage(new Stage()._setId(1));
        playOffGame.setStatus(GameStatus.LOSE);
        return playOffGame;
    }

    public PlayOffGame createUpdatedPlayOffGame(Integer playOffGameId) {
        PlayOffGame playOffGame = new PlayOffGame();
        playOffGame.setId(playOffGameId);
        playOffGame.setAwayParticipant(new Participant()._setId(1));
        playOffGame.setHomeParticipant(new Participant()._setId(2));
        playOffGame.setPosition(2);
        playOffGame.setResult(new Results("2:2"));
        playOffGame.setStage(new Stage()._setId(1));
        playOffGame.setStatus(GameStatus.DRAW);
        return playOffGame;
    }

}
