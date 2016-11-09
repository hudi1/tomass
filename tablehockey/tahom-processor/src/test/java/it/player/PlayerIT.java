package it.player;

import java.time.LocalDate;
import java.util.List;

import net.sf.lightair.LightAirSpringRunner;
import net.sf.lightair.annotation.Setup;
import net.sf.lightair.annotation.Verify;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.tahom.processor.service.player.PlayerService;
import org.tahom.repository.model.Player;
import org.tahom.repository.model.PlayerGender;
import org.tahom.repository.type.model.Surname;

@RunWith(LightAirSpringRunner.class)
@ContextConfiguration(locations = { "/spring/application-context-test.xml" })
@Setup.List({ @Setup("../clear-all.xml"), @Setup() })
public class PlayerIT {

    @Autowired
    private PlayerService playerService;

    @Test
    @Verify("createPlayerTest-verify.xml")
    public void createPlayerTest() throws Exception {
        Player player = playerService.addPlayer(createDefaultPlayer());
        Assert.assertNotNull(player.getId());
    }

    @Test
    @Verify("getPlayerTest-verify.xml")
    public void getPlayerTest() throws Exception {
        Player player = playerService.getPlayer(1);
        Assert.assertNotNull(player);
    }

    @Test
    @Verify("getPlayerTest-verify.xml")
    public void getAllPlayerTest() throws Exception {
        List<Player> players = playerService.listAllPlayers();
        Assert.assertSame(1, players.size());
    }

    @Test
    @Verify("updatePlayerTest-verify.xml")
    public void updatePlayerTest() throws Exception {
        int count = playerService.editPlayer(createUpdatedPlayer(1));
        Assert.assertNotSame(0, count);
    }

    @Test
    @Verify("deletePlayerTest-verify.xml")
    public void deletePlayerTest() throws Exception {
        int count = playerService.deletePlayer(1);
        Assert.assertNotSame(0, count);
    }

    @Test
    @Verify("getPlayerTest-verify.xml")
    public void getNotRegisteredPlayersTest() throws Exception {
        List<Player> players = playerService.listNotRegisteredPlayers(1);
        Assert.assertSame(0, players.size());
    }

    public Player createDefaultPlayer() throws Exception {
        Player player = new Player();
        player.setCity("City");
        player.setClub("Club");
        player.setCountry("Country");
        player.setDateOfBirth(LocalDate.of(2000, 1, 1));
        player.setGender(PlayerGender.M);
        player.setIthfId(1234);
        player.setName("Name");
        player.setNameAscii("NameAscii");
        player.setNickname("Nickname");
        player.setSurname(new Surname("Surname"));
        player.setSurnameAscii("SurnameAscii");
        player.setVerification(true);
        player.setWorldRanking(123);
        return player;
    }

    public Player createUpdatedPlayer(Integer id) throws Exception {
        Player player = new Player();
        player.setId(id);
        player.setCity("UpdatedCity");
        player.setClub("UpdatedClub");
        player.setCountry("UpdatedCountry");
        player.setDateOfBirth(LocalDate.of(2100, 1, 1));
        player.setGender(PlayerGender.I0);
        player.setIthfId(4321);
        player.setName("UpdatedName");
        player.setNameAscii("UpdatedNameAscii");
        player.setNickname("UpdatedNickname");
        player.setSurname(new Surname("UpdatedSurname"));
        player.setSurnameAscii("UpdatedSurnameAscii");
        player.setVerification(false);
        player.setWorldRanking(321);
        return player;
    }

}
