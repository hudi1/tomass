package org.tahom.processor.service.group;

import java.util.List;

import javax.inject.Inject;

import org.springframework.transaction.annotation.Transactional;
import org.tahom.repository.dao.GroupsDao;
import org.tahom.repository.model.Groups;

public class GroupService {

    @Inject
    private GroupsDao groupDao;

    @Transactional
    public Groups createGroup(Groups group) {
        return groupDao.insert(group);
    }

    @Transactional
    public int updateGroup(Groups group) {
        return groupDao.update(group);
    }

    @Transactional
    public int deleteGroup(Groups group) {
        return groupDao.delete(group);
    }

    @Transactional(readOnly = true)
    public Groups getGroup(Integer groupId) {
        return groupDao.get(new Groups()._setId(groupId));
    }

    @Transactional(readOnly = true)
    public List<Groups> listGroups(Groups group) {
        return groupDao.list(group);
    }

}
