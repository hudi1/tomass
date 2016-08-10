package org.tahom.processor.schedule;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.tahom.repository.model.Matchs;
import org.tahom.repository.model.Player;

public abstract class RoundRobinTest {

    protected Map<Player, Map<String, Map<Integer, Integer>>> statistic = new HashMap<>();

    protected static final String ROUNDS_COUNT = "round";
    protected static final String TABLES_COUNT = "table";

    protected void fillStatistic(List<Matchs> matches) {
        for (Matchs match : matches) {
            statistic
                    .get(match.getHomePlayer())
                    .get(TABLES_COUNT)
                    .put(match.getHockey(),
                            statistic.get(match.getHomePlayer()).get(TABLES_COUNT).get(match.getHockey()) + 1);
            statistic
                    .get(match.getHomePlayer())
                    .get(ROUNDS_COUNT)
                    .put(match.getRound(),
                            statistic.get(match.getHomePlayer()).get(ROUNDS_COUNT).get(match.getRound()) + 1);
            statistic
                    .get(match.getAwayPlayer())
                    .get(TABLES_COUNT)
                    .put(match.getHockey(),
                            statistic.get(match.getAwayPlayer()).get(TABLES_COUNT).get(match.getHockey()) + 1);
            statistic
                    .get(match.getAwayPlayer())
                    .get(ROUNDS_COUNT)
                    .put(match.getRound(),
                            statistic.get(match.getAwayPlayer()).get(ROUNDS_COUNT).get(match.getRound()) + 1);
        }
    }
}
