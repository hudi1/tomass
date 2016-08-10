package org.tahom.processor.service.registration.dto;

import java.util.List;

import org.tahom.repository.model.Groups;
import org.tahom.repository.model.Participant;

public class RegistrationDto {

    private List<Groups> groups;
    private List<Participant> participants;

    public List<Groups> getGroups() {
        return groups;
    }

    public void setGroups(List<Groups> groups) {
        this.groups = groups;
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Participant> participants) {
        this.participants = participants;
    }

}
