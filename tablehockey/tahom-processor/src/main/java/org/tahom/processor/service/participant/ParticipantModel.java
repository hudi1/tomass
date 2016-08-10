package org.tahom.processor.service.participant;

import org.tahom.repository.model.Participant;
import org.tahom.repository.model.Player;
import org.tahom.repository.model.Tournament;

public class ParticipantModel {

    public Participant createParticipant(Player player, Tournament tournament) {
        Participant participant = new Participant();
        participant.setPlayer(player);
        participant.setTournament(tournament);
        return participant;
    }

}
