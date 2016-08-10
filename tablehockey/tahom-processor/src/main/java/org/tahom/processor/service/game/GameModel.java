package org.tahom.processor.service.game;

import org.tahom.repository.model.Game;
import org.tahom.repository.model.GameStatus;
import org.tahom.repository.model.GroupParticipant;

public class GameModel {

    public Game createGame(GroupParticipant homeGroupParticipant, GroupParticipant awayGroupParticipant) {
        Game game = new Game();
        game.setAwayGroupParticipant(awayGroupParticipant);
        game.setHomeGroupParticipant(homeGroupParticipant);
        return game;
    }

    public void changeParticipants(Game game) {
        GroupParticipant temp = game.getAwayGroupParticipant();
        game.setAwayGroupParticipant(game.getHomeGroupParticipant());
        game.setHomeGroupParticipant(temp);
        if (GameStatus.WIN.equals(game.getStatus())) {
            game.setStatus(GameStatus.LOSE);
        } else if (GameStatus.LOSE.equals(game.getStatus())) {
            game.setStatus(GameStatus.WIN);
        }
    }
}
