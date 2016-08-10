package org.tahom.processor.service.participant;

import org.tahom.repository.model.GroupParticipant;
import org.tahom.repository.model.Groups;
import org.tahom.repository.model.Participant;
import org.tahom.repository.type.model.Score;

public class GroupParticipantModel {

    public GroupParticipant createParticipant(Participant participant, Groups group) {
        GroupParticipant groupParticipant = new GroupParticipant();
        groupParticipant.setGroup(group);
        groupParticipant.setParticipant(participant);
        groupParticipant.setPoints(0);
        groupParticipant.setScore(Score.createDefaultScore());
        return groupParticipant;
    }
}
