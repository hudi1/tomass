package it.game;

import java.util.Arrays;
import java.util.List;

import net.sf.lightair.LightAirSpringRunner;
import net.sf.lightair.annotation.Setup;
import net.sf.lightair.annotation.Verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.tahom.processor.service.game.GameService;
import org.tahom.repository.model.GroupParticipant;

@RunWith(LightAirSpringRunner.class)
@ContextConfiguration(locations = { "/spring/application-context-test.xml" })
@Setup.List({ @Setup("../clear-all.xml"), @Setup() })
public class GameIT {

    @Autowired
    private GameService gameService;

    @Test
    @Verify("createGamesTest-verify.xml")
    public void createGamesTest() {
        List<GroupParticipant> participants = Arrays.asList(new GroupParticipant()._setId(1),
                new GroupParticipant()._setId(2), new GroupParticipant()._setId(3), new GroupParticipant()._setId(4),
                new GroupParticipant()._setId(5));
        gameService.createGames(participants, participants.get(0));
    }

}
