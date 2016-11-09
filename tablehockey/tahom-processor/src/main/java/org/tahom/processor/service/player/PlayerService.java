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

    /**
     * UC10a
     * 
     * @param player
     * @return
     */
    @Transactional(readOnly = true)
    public List<Player> listAllPlayers() {
        return playerDao.list(new Player());
    }

    /**
     * UC10b
     * 
     * @param tournamentId
     * @return
     */
    @Transactional(readOnly = true)
    public List<Player> listNotRegisteredPlayers(Integer tournamentId) {
        return playerDao.listNotRegisteredPlayers(new Tournament()._setId(tournamentId));
    }

    /**
     * UC10c
     * 
     * @param player
     * @return
     */
    @Transactional
    public Player addPlayer(Player player) {
        return playerDao.insert(player);
    }

    /**
     * UC10d
     * 
     * @param playerId
     * @return
     */
    @Transactional(readOnly = true)
    public Player getPlayer(Integer playerId) {
        return playerDao.get(new Player()._setId(playerId));
    }

    /**
     * UC10e
     * 
     */
    public void mergePlayers() {
        // TODO
    }

    /**
     * UC10f
     * 
     * @param player
     * @return
     */
    @Transactional
    public int editPlayer(Player player) {
        return playerDao.update(player._setNull_(Attribute.values()));
    }

    /**
     * UC10g
     * 
     * @param player
     * @return
     */
    @Transactional
    public int deletePlayer(Integer id) {
        return playerDao.delete(new Player()._setId(id));
    }

}