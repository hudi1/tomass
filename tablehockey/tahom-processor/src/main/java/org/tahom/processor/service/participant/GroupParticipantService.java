package org.tahom.processor.service.participant;

import java.util.List;

import javax.inject.Inject;

import org.springframework.transaction.annotation.Transactional;
import org.tahom.repository.dao.GroupParticipantDao;
import org.tahom.repository.model.GroupParticipant;
import org.tahom.repository.model.GroupParticipant.Attribute;

public class GroupParticipantService {

    @Inject
    private GroupParticipantDao groupParticipantDao;

    @Transactional
    public GroupParticipant createGroupParticipant(GroupParticipant groupParticipant) {
        return groupParticipantDao.insert(groupParticipant);
    }

    @Transactional
    public int updateGroupParticipant(GroupParticipant groupParticipant) {
        return groupParticipantDao.update(groupParticipant._setNull_(Attribute.values()));
    }

    @Transactional
    public int deleteGroupParticipant(GroupParticipant groupParticipant) {
        return groupParticipantDao.delete(groupParticipant);
    }

    @Transactional(readOnly = true)
    public GroupParticipant getGroupParticipant(Integer groupParticipantId) {
        return groupParticipantDao.get(new GroupParticipant()._setId(groupParticipantId));
    }

    @Transactional(readOnly = true)
    public List<GroupParticipant> listGroupParticipants(GroupParticipant groupParticipant) {
        return groupParticipantDao.list(groupParticipant);
    }

}
