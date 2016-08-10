package org.tahom.processor.schedule;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.tahom.processor.service.schedule.dto.ScheduleDto;
import org.tahom.repository.model.GroupParticipant;
import org.tahom.repository.model.Matchs;

import com.google.common.collect.Lists;

public class AdvancedRoundRobinSchedule extends RoundRobinSchedule {

    private LinkedList<List<GroupParticipant>> playerPerBasicGroup;
    private int playerCount;
    private List<Matchs> schedule;
    private Integer actualRound;
    private Integer actualHockey;

    // TODO optimalizovat pre menej hokej
    public AdvancedRoundRobinSchedule(ScheduleDto scheduleDto) {
        playerPerBasicGroup = new LinkedList<>(Lists.partition(scheduleDto.getGroup().getGroupParticipants(),
                scheduleDto.getGroup().getStage().getCopyResultStage().getGroups().size()));
        this.actualRound = 0;
        this.actualHockey = 0;
    }

    @Override
    public List<Matchs> createSchedule() {
        schedule = new ArrayList<Matchs>();

        int groupCount = playerPerBasicGroup.size();

        if (groupCount % 2 == 0) {
            for (int i = 0; i < groupCount - 1; i++) {
                createEvenGroupRound();
                rotatePlayerPerEvenBasicGroup();
            }
        } else {
            // TODO neparny pocet skupin
            for (int i = 0; i < groupCount; i++) {
                createOddGroupRound();
                rotatePlayerPerOddBasicGroup();
            }
        }
        return schedule;
    }

    private void createOddGroupRound() {
        List<Round> rounds = new ArrayList<Round>();
        for (int i = 0; i < playerPerBasicGroup.size() / 2; i++) {
            rounds.add(new Round(playerPerBasicGroup.get(i),
                    playerPerBasicGroup.get(playerPerBasicGroup.size() - i - 1)));
        }

        for (int i = 0; i < playerCount; i++) {
            for (Round round : rounds) {
                round.addNextGames();
            }
        }
    }

    private void createEvenGroupRound() {
        List<Round> rounds = new ArrayList<Round>();
        for (int i = 0; i < playerPerBasicGroup.size() / 2; i++) {
            rounds.add(new Round(playerPerBasicGroup.get(i),
                    playerPerBasicGroup.get(playerPerBasicGroup.size() - i - 1)));
        }

        for (int i = 0; i < playerCount; i++) {
            for (Round round : rounds) {
                round.addNextGames();
            }
        }
    }

    private void createOddGroupRoundOld() {
        List<Round> rounds = new ArrayList<Round>();

        for (int j = 0; j < 2; j++) {
            for (int i = 0; i < playerPerBasicGroup.size(); i++) {

                if (playerPerBasicGroup.size() % 2 == 1) {
                    if (j % 2 == 0) {
                        if (i % 2 == 0) {
                            if (i == playerPerBasicGroup.size() - 1) {
                                fillVerticalGroup(rounds, i, playerPerBasicGroup);
                            } else {
                                fillUpHorizontalGroup(rounds, i, playerPerBasicGroup);
                            }
                        } else {
                            fillDownHorizontalGroup(rounds, i, playerPerBasicGroup);
                        }
                    } else {
                        if (i % 2 == 0) {
                            if (i == 0) {
                                fillVerticalGroup(rounds, i, playerPerBasicGroup);
                            } else {
                                fillDownHorizontalGroup(rounds, i, playerPerBasicGroup);
                            }
                        } else {
                            fillUpHorizontalGroup(rounds, i, playerPerBasicGroup);
                        }
                    }
                }
            }
        }

        for (int i = 0; i < playerCount; i++) {
            for (Round round : rounds) {
                actualRound++;
                round.addNextGames();
            }
        }
    }

    private void rotatePlayerPerEvenBasicGroup() {
        List<GroupParticipant> lastGroupPlayer = playerPerBasicGroup.removeLast();
        playerPerBasicGroup.add(1, lastGroupPlayer);
    }

    private void rotatePlayerPerOddBasicGroup() {
        List<GroupParticipant> lastGroupPlayer = playerPerBasicGroup.removeLast();
        playerPerBasicGroup.add(0, lastGroupPlayer);
    }

    private void fillUpHorizontalGroup(List<Round> rounds, int i, LinkedList<List<GroupParticipant>> playerByGroup) {
        List<GroupParticipant> participants1 = playerByGroup.get(i).subList(0, playerByGroup.get(i).size() / 2);
        int index = i + 1;
        if (index == playerByGroup.size()) {
            index = 0;
        }
        List<GroupParticipant> participants2 = playerByGroup.get(index).subList(0, playerByGroup.get(i).size() / 2);
        rounds.add(new Round(participants1, participants2));

    }

    private void fillDownHorizontalGroup(List<Round> rounds, int i, LinkedList<List<GroupParticipant>> playerByGroup) {
        List<GroupParticipant> participants1 = playerByGroup.get(i).subList(playerByGroup.get(i).size() / 2,
                playerByGroup.get(i).size());
        int index = i + 1;
        if (index == playerByGroup.size()) {
            index = 0;
        }
        List<GroupParticipant> participants2 = playerByGroup.get(index).subList(playerByGroup.get(i).size() / 2,
                playerByGroup.get(i).size());
        rounds.add(new Round(participants1, participants2));
    }

    private void fillVerticalGroup(List<Round> rounds, int i, LinkedList<List<GroupParticipant>> playerByGroup) {
        List<GroupParticipant> participants1 = playerByGroup.get(i).subList(0, playerByGroup.get(i).size() / 2);
        int index = i + 1;
        if (index == playerByGroup.size()) {
            index = 0;
        }
        List<GroupParticipant> participants2 = playerByGroup.get(index).subList(playerByGroup.get(i).size() / 2,
                playerByGroup.get(i).size());
        rounds.add(new Round(participants1, participants2));
    }

    @Override
    protected Integer getRound() {
        return actualRound;
    }

    @Override
    protected Integer getHockey() {
        return actualHockey;
    }

    public class Round {

        private List<GroupParticipant> participants1;
        private List<GroupParticipant> participants2;

        public Round(List<GroupParticipant> participants1, List<GroupParticipant> participants2) {
            this.participants1 = participants1;
            this.participants2 = participants2;
        }

        public void addNextGames() {
            for (int i = 0; i < participants1.size(); i++) {
                Matchs match = createMatch(participants1.get(i), participants2.get(i));
                if (match != null) {
                    schedule.add(match);
                }
            }
            Collections.rotate(participants1, 1);
        }
    }
}