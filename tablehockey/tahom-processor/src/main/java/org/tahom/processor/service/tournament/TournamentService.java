package org.tahom.processor.service.tournament;

import java.util.List;

import javax.inject.Inject;

import org.springframework.transaction.annotation.Transactional;
import org.tahom.repository.dao.TournamentExtDao;
import org.tahom.repository.model.Tournament;
import org.tahom.repository.model.Tournament.Attribute;
import org.tahom.repository.model.User;

public class TournamentService {

    @Inject
    private TournamentExtDao tournamentDao;

    /**
     * UC2a
     * 
     * @return
     */
    @Transactional(readOnly = true)
    public List<Tournament> listAllTournament() {
        return tournamentDao.list(new Tournament()._setVisible(true));
    }

    /**
     * UC2b
     * 
     * @param tournament
     * @return
     */
    @Transactional
    public Tournament addTournament(Tournament tournament) {
        return tournamentDao.insert(tournament);
    }

    /**
     * UC2ca
     * 
     * @param tournamentId
     * @return
     */
    @Transactional(readOnly = true)
    public List<Tournament> listTournamentsByUserAdmin(Integer userId) {
        User user = new User();
        user.setId(userId);
        return tournamentDao.listTournamentsByUserAdmin(user);
    }

    /**
     * UC2cb
     * 
     * @param tournamentId
     * @return
     */
    @Transactional(readOnly = true)
    public List<Tournament> listTournamentsByUserParticipant(Integer userId) {
        User user = new User();
        user.setId(userId);
        return tournamentDao.listTournamentsByUserParticipant(user);
    }

    /**
     * UC2d
     * 
     * @param tournamentId
     * @return
     */
    @Transactional(readOnly = true)
    public Tournament getTournament(Integer id) {
        return tournamentDao.get(new Tournament()._setId(id));
    }

    /**
     * UC2e
     * 
     * @param tournament
     * @return
     */
    @Transactional
    public int editTournament(Tournament tournament) {
        return tournamentDao.update(tournament._setNull_(Attribute.values()));
    }

    /**
     * UC2f
     * 
     * @param tournament
     * @return
     */
    @Transactional
    public int deleteTournament(Integer id) {
        return tournamentDao.delete(new Tournament()._setId(id));
    }

}