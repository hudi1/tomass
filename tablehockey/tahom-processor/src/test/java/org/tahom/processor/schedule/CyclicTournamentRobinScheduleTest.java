package org.tahom.processor.schedule;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.tahom.processor.service.schedule.dto.ScheduleDto;
import org.tahom.repository.model.Game;
import org.tahom.repository.model.GroupParticipant;
import org.tahom.repository.model.Groups;
import org.tahom.repository.model.Matchs;
import org.tahom.repository.model.Participant;
import org.tahom.repository.model.Player;

@RunWith(value = Parameterized.class)
public class CyclicTournamentRobinScheduleTest extends RoundRobinTest {

    private List<GroupParticipant> participants;
    private ScheduleDto scheduleDto;
    private RoundRobinSchedule schedule;
    private int playerCount;

    private static final int MAX_PLAYER_COUNT = 40;

    @Before
    public void setup() {
        participants = new ArrayList<>();
        scheduleDto = new ScheduleDto();
        scheduleDto.setGroup(new Groups()._setGroupParticipants(participants));

        for (int i = 0; i < playerCount; i++) {
            participants.add(new GroupParticipant()._setParticipant(
                    new Participant()._setId(i + 1)._setPlayer(new Player()._setId(i + 1)))._setId(i + 1));
        }

        for (GroupParticipant participant1 : participants) {
            for (GroupParticipant participant2 : participants) {
                participant1.getGames().add(
                        new Game()._setHomeGroupParticipant(participant1)._setAwayGroupParticipant(participant2));
            }
        }

        schedule = new CyclicRoundRobinSchedule(scheduleDto);

        for (int i = 0; i < playerCount; i++) {
            statistic.put(participants.get(i).getParticipant().getPlayer(),
                    new HashMap<String, Map<Integer, Integer>>());
            statistic.get(participants.get(i).getParticipant().getPlayer()).put(ROUNDS_COUNT,
                    new HashMap<Integer, Integer>());
            statistic.get(participants.get(i).getParticipant().getPlayer()).put(TABLES_COUNT,
                    new HashMap<Integer, Integer>());
            for (int j = 0; j < playerCount; j++) {
                statistic.get(participants.get(i).getParticipant().getPlayer()).get(ROUNDS_COUNT).put(j + 1, 0);
            }
            for (int j = 0; j < playerCount / 2; j++) {
                statistic.get(participants.get(i).getParticipant().getPlayer()).get(TABLES_COUNT).put(j + 1, 0);
            }
        }
    }

    public CyclicTournamentRobinScheduleTest(int playerCount) {
        this.playerCount = playerCount;
    }

    @Parameters
    public static List<Object[]> data() {
        final List<Object[]> parametry = new ArrayList<Object[]>();
        for (int i = 2; i <= MAX_PLAYER_COUNT; i++) {
            if (i % 2 == 0) {
                continue;
            }
            parametry.add(new Object[] { i });
        }
        return parametry;
    }

    @Test
    public void test() throws Exception {
        List<Matchs> matches = schedule.createSchedule();
        fillStatistic(matches);
        analyseStatistic();
    }

    private void analyseStatistic() {
        for (Entry<Player, Map<String, Map<Integer, Integer>>> player : statistic.entrySet()) {
            // System.out.println("ID: " + player.getKey().getId());
            for (Entry<String, Map<Integer, Integer>> stats : player.getValue().entrySet()) {
                // System.out.println("STAT: " + stats.getKey());
                for (Entry<Integer, Integer> tables : stats.getValue().entrySet()) {
                    // System.out.println(tables.getKey() + " -> " + tables.getValue());
                    if (stats.getKey().equals(ROUNDS_COUNT)) {
                        Assert.assertTrue(1 >= tables.getValue());
                    } else if (stats.getKey().equals(TABLES_COUNT)) {
                        Assert.assertTrue(2 >= tables.getValue());
                        Assert.assertTrue(1 <= tables.getValue());
                    }
                }
            }
        }
    }

}
