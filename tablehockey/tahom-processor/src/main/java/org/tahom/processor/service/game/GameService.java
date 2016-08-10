package org.tahom.processor.service.game;

import java.util.List;

import javax.inject.Inject;

import org.springframework.transaction.annotation.Transactional;
import org.tahom.repository.dao.GameDao;
import org.tahom.repository.model.Game;
import org.tahom.repository.model.GroupParticipant;

public class GameService {

    @Inject
    private GameModel gameModel;

    @Inject
    private GameDao gameDao;

    @Transactional
    public void createGames(List<GroupParticipant> groupParticipants, GroupParticipant newGroupParticipants) {
        for (GroupParticipant groupParticipant : groupParticipants) {
            if (!groupParticipant.equals(newGroupParticipants)) {
                Game game = gameModel.createGame(groupParticipant, newGroupParticipants);
                gameDao.insert(game);
                gameModel.changeParticipants(game);
                gameDao.insert(game);
            }
        }
    }
}
