package org.tahom.processor.schedule;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.tahom.processor.service.schedule.dto.ScheduleDto;
import org.tahom.repository.model.GroupParticipant;
import org.tahom.repository.model.Matchs;

public class BalancedRoundRobinSchedule extends RoundRobinSchedule {

    private final List<GroupParticipant> participants;
    private Integer rounds;
    private Integer actualRound;
    private Integer actualHockey;
    private Integer startHockey;
    private Integer swap;
    private Integer playersCount;
    private List<Matchs> schedule;

    public BalancedRoundRobinSchedule(ScheduleDto scheduleDto) {
        this.participants = scheduleDto.getGroup().getGroupParticipants();
        this.rounds = participants.size() - 1;
        this.playersCount = scheduleDto.getGroup().getGroupParticipants().size();
        this.startHockey = scheduleDto.getStartHockey();
        this.actualHockey = startHockey;
        this.swap = 1;
        this.schedule = new ArrayList<>();
    }

    public List<Matchs> createSchedule() {
        if (!schedule.isEmpty()) {
            return schedule;
        }

        if (participants.size() % 2 == 1 || (participants.size() % 6 != 0 && participants.size() % 6 != 2)) {
            // TODO Exception handling
            throw new RuntimeException();
        }

        for (int i = 0; i < rounds; i++) {
            actualRound = i + 1;
            LinkedList<GroupParticipant> roundParticipants = prepareParticipants(participants);

            swap = calculateSwapPosition(i, swap, playersCount);

            while (!roundParticipants.isEmpty()) {
                Matchs match;
                if (swapPlayers(i, rounds, playersCount, swap, getHockey())) {
                    match = createMatch(roundParticipants.removeLast(), roundParticipants.removeFirst());
                } else {
                    match = createMatch(roundParticipants.removeFirst(), roundParticipants.removeLast());
                }
                if (match != null) {
                    schedule.add(match);
                    actualHockey++;
                }
            }
            resetHockey();
            GroupParticipant temp = participants.remove(0);
            Collections.rotate(participants, playersCount / 2);
            participants.add(0, temp);
        }
        return schedule;
    }

    public boolean swapPlayers(int round, int rounds, int playersCount, int swap, int hockeyAfterSwap) {
        if (round == rounds - 1) {
            return false;
        }
        if (round < ((playersCount / 2) - 1)) {
            return false;
        }
        if (hockeyAfterSwap != 1 && hockeyAfterSwap != swap) {
            return false;
        }
        return true;
    }

    private LinkedList<GroupParticipant> prepareParticipants(List<GroupParticipant> originalParticipants) {
        LinkedList<GroupParticipant> participants = new LinkedList<>(originalParticipants);
        GroupParticipant temp = participants.remove(1);
        participants.addLast(temp);
        return participants;
    }

    private int calculateSwapPosition(int round, int swap, int playersCount) {
        if (round < ((playersCount / 2) - 1)) {
            swap++;
        } else if (round > ((playersCount / 2) - 1)) {
            swap--;
        }
        return swap;
    }

    private void resetHockey() {
        actualHockey = startHockey;
    }

    @Override
    protected Integer getRound() {
        return actualRound;
    }

    @Override
    protected Integer getHockey() {
        if (this.actualHockey == 1) {
            return swap;
        } else if (actualHockey == swap) {
            return 1;
        }
        return actualHockey;
    }

}
