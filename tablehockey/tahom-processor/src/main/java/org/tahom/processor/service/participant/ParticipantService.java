package org.tahom.processor.service.participant;

import java.util.List;

import javax.inject.Inject;

import org.springframework.transaction.annotation.Transactional;
import org.tahom.repository.dao.ParticipantDao;
import org.tahom.repository.model.Participant;
import org.tahom.repository.model.Participant.Association;

public class ParticipantService {

    @Inject
    private ParticipantDao participantDao;

    @Transactional
    public Participant createParticipant(Participant participant) {
        return participantDao.insert(participant);
    }

    @Transactional
    public int deleteParticipant(Participant participant) {
        return participantDao.delete(participant);
    }

    @Transactional(readOnly = true)
    public List<Participant> listParticipants(Participant participant) {
        participant._clearInit_(Association.player);
        participant._clearInit_(Association.tournament);
        return participantDao.list(participant);
    }
}
