package it.tournament;

import java.io.File;
import java.nio.file.Files;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import net.sf.lightair.LightAirSpringRunner;
import net.sf.lightair.annotation.Setup;
import net.sf.lightair.annotation.Verify;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.tahom.processor.service.tournament.TournamentService;
import org.tahom.repository.model.Tournament;
import org.tahom.repository.model.TournamentStatus;

@RunWith(LightAirSpringRunner.class)
@ContextConfiguration(locations = { "/spring/application-context-test.xml" })
@Setup.List({ @Setup("../clear-all.xml"), @Setup() })
public class TournamentIT {

    @Autowired
    private TournamentService tournamentService;

    @Test
    @Verify("createTournamentTest-verify.xml")
    public void createTournamentTest() throws Exception {
        Tournament tournament = tournamentService.addTournament(createDefaultTournament());
        Assert.assertNotNull(tournament.getId());
    }

    @Test
    @Verify("deleteTournamentTest-verify.xml")
    public void deleteTournamentTest() throws Exception {
        int count = tournamentService.deleteTournament(1);
        Assert.assertNotSame(0, count);
    }

    @Test
    @Verify("getTournamentTest-verify.xml")
    public void getTournamentTest() throws Exception {
        Tournament tournament = tournamentService.getTournament(1);
        Assert.assertNotNull(tournament);
    }

    @Test
    @Verify("getTournamentTest-verify.xml")
    public void listTournamentTest() throws Exception {
        List<Tournament> tournaments = tournamentService.listAllTournament();
        Assert.assertSame(1, tournaments.size());
    }

    @Test
    @Verify("updateTournamentTest-verify.xml")
    public void updateTournamentTest() throws Exception {
        int count = tournamentService.editTournament(createUpdatedTournament(1));
        Assert.assertNotSame(0, count);
    }

    @Test
    @Verify("getTournamentTest-verify.xml")
    public void listTournamentsByUserAdminTest() throws Exception {
        List<Tournament> tournaments = tournamentService.listTournamentsByUserAdmin(1);
        Assert.assertSame(1, tournaments.size());
    }

    @Test
    @Verify("getTournamentTest-verify.xml")
    public void listTournamentsByUserParticipantTest() throws Exception {
        List<Tournament> tournaments = tournamentService.listTournamentsByUserParticipant(1);
        Assert.assertSame(1, tournaments.size());
    }

    public Tournament createDefaultTournament() throws Exception {
        Tournament tournament = new Tournament();
        tournament.setAddress("Address");
        tournament.setCity("City");
        tournament.setCountry("Country");
        tournament.setLogo(Files.readAllBytes(new File("src/test/resources/image/test.jpg").toPath()));
        tournament.setName("Name");
        tournament.setRegistrationFrom(LocalDateTime.of(2016, 1, 1, 9, 0));
        tournament.setRegistrationTo(LocalDateTime.of(2016, 1, 1, 10, 0));
        tournament.setStatus(TournamentStatus.RO);
        tournament.setTournamentDate(LocalDate.of(2016, 1, 1));
        tournament.setVisible(true);
        return tournament;
    }

    public Tournament createUpdatedTournament(Integer tournamentId) throws Exception {
        Tournament tournament = new Tournament();
        tournament.setId(tournamentId);
        tournament.setAddress("UpdatedAddress");
        tournament.setCity("UpdatedCity");
        tournament.setCountry("UpdatedCountry");
        tournament.setLogo(Files.readAllBytes(new File("src/test/resources/image/test.jpg").toPath()));
        tournament.setName("UpdatedName");
        tournament.setRegistrationFrom(LocalDateTime.of(2015, 1, 1, 9, 0));
        tournament.setRegistrationTo(LocalDateTime.of(2015, 1, 1, 10, 0));
        tournament.setStatus(TournamentStatus.F);
        tournament.setTournamentDate(LocalDate.of(2015, 1, 1));
        tournament.setVisible(false);
        return tournament;
    }

}
