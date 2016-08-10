package org.tahom.processor.service.player;

import java.util.List;

import javax.inject.Inject;

import org.springframework.transaction.annotation.Transactional;
import org.tahom.repository.dao.PlayerExtDao;
import org.tahom.repository.model.Player;
import org.tahom.repository.model.Player.Attribute;
import org.tahom.repository.model.Tournament;

public class PlayerService {

    @Inject
    private PlayerExtDao playerDao;

    @Transactional
    public Player createPlayer(Player player) {
        return playerDao.insert(player);
    }

    @Transactional
    public int updatePlayer(Player player) {
        return playerDao.update(player._setNull_(Attribute.values()));
    }

    @Transactional
    public int deletePlayer(Player player) {
        return playerDao.delete(player);
    }

    @Transactional(readOnly = true)
    public Player getPlayer(Integer playerId) {
        return playerDao.get(new Player()._setId(playerId));
    }

    @Transactional(readOnly = true)
    public List<Player> listPlayers(Player player) {
        return playerDao.list(player);
    }

    @Transactional(readOnly = true)
    public List<Player> listNotRegisteredPlayers(Tournament tournament) {
        return playerDao.listNotRegisteredPlayers(tournament);
    }
}