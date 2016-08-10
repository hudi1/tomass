package org.tahom.repository.model.impl;

import org.tahom.repository.model.Game;

public class GameImpl extends Game {

    private static final long serialVersionUID = 1L;

    private Integer hockey;
    private Integer round;

    public GameImpl() {
    }

    public GameImpl(Game game) {
        super.setAwayGroupParticipant(game.getAwayGroupParticipant());
        super.setHomeGroupParticipant(game.getHomeGroupParticipant());
        super.setResult(game.getResult());
        super.setId(game.getId());
    }

    public Integer getHockey() {
        return hockey;
    }

    public void setHockey(Integer hockey) {
        this.hockey = hockey;
    }

    public Integer getRound() {
        return round;
    }

    public void setRound(Integer round) {
        this.round = round;
    }

}
