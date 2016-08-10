package org.tahom.processor.service.registration;

import java.util.List;

import javax.inject.Inject;

import org.springframework.transaction.annotation.Transactional;
import org.tahom.processor.service.game.GameService;
import org.tahom.processor.service.participant.GroupParticipantModel;
import org.tahom.processor.service.participant.GroupParticipantService;
import org.tahom.processor.service.participant.ParticipantModel;
import org.tahom.processor.service.participant.ParticipantService;
import org.tahom.repository.model.GroupParticipant;
import org.tahom.repository.model.Groups;
import org.tahom.repository.model.Participant;
import org.tahom.repository.model.Player;
import org.tahom.repository.model.Tournament;

public class RegistrationService {

    @Inject
    private ParticipantService participantService;

    @Inject
    private ParticipantModel participantModel;

    @Inject
    private GroupParticipantService groupParticipantService;

    @Inject
    private GroupParticipantModel groupParticipantModel;

    @Inject
    private GameService gameService;

    @Transactional
    public void registerGroupParticipants(List<Participant> participants, Groups group) {
        for (Participant participant : participants) {
            registerGroupParticipant(participant, group);
        }
    }

    @Transactional
    public void registerGroupParticipant(Participant participant, Groups group) {
        GroupParticipant groupParticipant = groupParticipantModel.createParticipant(participant, group);
        groupParticipantService.createGroupParticipant(groupParticipant);
        gameService.createGames(group.getGroupParticipants(), groupParticipant);
    }

    @Transactional
    public void registerParticipant(Player player, Tournament tournament) {
        // TODO exception when already registered
        Participant participant = participantModel.createParticipant(player, tournament);
        participantService.createParticipant(participant);
    }
}
