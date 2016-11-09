package org.tahom.repository.dao;

import java.util.List;

import org.tahom.repository.model.Tournament;
import org.tahom.repository.model.User;

public interface TournamentExtDao extends TournamentDao {

    public List<Tournament> listTournamentsByUserAdmin(User user);

    public List<Tournament> listTournamentsByUserParticipant(User user);
}
