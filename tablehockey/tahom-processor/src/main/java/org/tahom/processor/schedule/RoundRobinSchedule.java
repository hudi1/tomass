package org.tahom.processor.schedule;

import java.util.List;

import org.tahom.repository.model.Game;
import org.tahom.repository.model.GroupParticipant;
import org.tahom.repository.model.Matchs;

public abstract class RoundRobinSchedule {

    protected Matchs createMatch(GroupParticipant homePlayer, GroupParticipant awayPlayer) {
        if (!homePlayer.isTemp() && !awayPlayer.isTemp()) {
            for (Game game : homePlayer.getGames()) {
                if (game.getAwayGroupParticipant().equals(awayPlayer)) {
                    game._setHomeGroupParticipant(homePlayer)._setAwayGroupParticipant(awayPlayer);
                    Matchs match = new Matchs();
                    match.setAwayPlayer(awayPlayer.getParticipant().getPlayer());
                    match.setGame(game);
                    match.setGroup(game.getHomeGroupParticipant().getGroup());
                    match.setHomePlayer(homePlayer.getParticipant().getPlayer());
                    match.setRound(getRound());
                    match.setHockey(getHockey());
                    return match;
                }
            }
        }
        return null;
    }

    protected abstract Integer getRound();

    protected abstract Integer getHockey();

    public abstract List<Matchs> createSchedule();

}
