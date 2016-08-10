package org.tahom.processor.schedule;

import java.util.ArrayList;
import java.util.List;

import org.tahom.repository.model.Matchs;

public class EmptyRoundRobinSchedule extends RoundRobinSchedule {

    public EmptyRoundRobinSchedule() {
    }

    public List<Matchs> createSchedule() {
        return new ArrayList<Matchs>();
    }

    @Override
    protected Integer getRound() {
        return null;
    }

    @Override
    protected Integer getHockey() {
        return null;
    }

}
