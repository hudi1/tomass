package org.tahom.processor.service.playOffGame;

import java.util.List;

import javax.inject.Inject;

import org.springframework.transaction.annotation.Transactional;
import org.sqlproc.engine.impl.SqlStandardControl;
import org.tahom.repository.dao.PlayOffGameDao;
import org.tahom.repository.model.PlayOffGame;
import org.tahom.repository.model.PlayOffGame.Attribute;

public class PlayOffGameService {

    @Inject
    private PlayOffGameDao playOffGameDao;

    @Transactional
    public PlayOffGame createPlayOffGame(PlayOffGame playOffGame) {
        return playOffGameDao.insert(playOffGame);
    }

    @Transactional(readOnly = true)
    public PlayOffGame getPlayOffGame(PlayOffGame playOffGame) {
        return playOffGameDao.get(playOffGame);
    }

    @Transactional
    public int updatePlayOffGame(PlayOffGame playOffGame) {
        playOffGame._setNull_(Attribute.values());
        return playOffGameDao.update(playOffGame);
    }

    @Transactional
    public int deletePlayOffGame(PlayOffGame playOffGame) {
        return playOffGameDao.delete(playOffGame);
    }

    @Transactional(readOnly = true)
    public List<PlayOffGame> getPlayOffGames(PlayOffGame playOffGame) {
        SqlStandardControl control = new SqlStandardControl();
        control.setAscOrder(PlayOffGame.ORDER_BY_POSITION);

        playOffGame.setInit_(PlayOffGame.Association.awayParticipant.name(),
                PlayOffGame.Association.homeParticipant.name());
        return playOffGameDao.list(playOffGame, control);
    }

}
