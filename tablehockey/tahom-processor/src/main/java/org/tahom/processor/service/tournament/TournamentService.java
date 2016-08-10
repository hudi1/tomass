package org.tahom.processor.service.tournament;

import java.util.List;

import javax.inject.Inject;

import org.springframework.transaction.annotation.Transactional;
import org.tahom.repository.dao.TournamentDao;
import org.tahom.repository.model.Tournament;
import org.tahom.repository.model.Tournament.Attribute;

public class TournamentService {

    @Inject
    private TournamentDao tournamentDao;

    @Transactional
    public Tournament createTournament(Tournament tournament) {
        return tournamentDao.insert(tournament);
    }

    @Transactional
    public int updateTournament(Tournament tournament) {
        return tournamentDao.update(tournament._setNull_(Attribute.values()));
    }

    @Transactional
    public int deleteTournament(Tournament tournament) {
        return tournamentDao.delete(tournament);
    }

    @Transactional(readOnly = true)
    public Tournament getTournament(Integer tournamentId) {
        return tournamentDao.get(new Tournament()._setId(tournamentId));
    }

    @Transactional(readOnly = true)
    public List<Tournament> listTournament(Tournament tournament) {
        return tournamentDao.list(tournament);
    }

}