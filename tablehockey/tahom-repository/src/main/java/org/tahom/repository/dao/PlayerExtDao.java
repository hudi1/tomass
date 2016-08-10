package org.tahom.repository.dao;

import java.util.List;

import org.tahom.repository.model.Player;
import org.tahom.repository.model.Tournament;

public interface PlayerExtDao extends PlayerDao {

    public List<Player> listNotRegisteredPlayers(Tournament tournament);

}
