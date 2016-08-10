package org.tahom.processor.service.participant;

import java.util.List;

import javax.inject.Inject;

import org.springframework.transaction.annotation.Transactional;
import org.tahom.repository.dao.ParticipantDao;
import org.tahom.repository.model.Participant;

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
        return participantDao.list(participant);
    }
}
