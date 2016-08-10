package org.tahom.processor.service.user;

import java.util.List;

import javax.inject.Inject;

import org.springframework.transaction.annotation.Transactional;
import org.sqlproc.engine.impl.SqlStandardControl;
import org.tahom.repository.dao.UserDao;
import org.tahom.repository.model.User;
import org.tahom.repository.model.User.Attribute;

public class UserService {

    @Inject
    private UserDao userDao;

    @Transactional
    public User createUser(User user) {
        return userDao.insert(user);
    }

    @Transactional
    public int updateUser(User user) {
        return userDao.update(user._setNull_(Attribute.values()));
    }

    @Transactional
    public int deleteUser(Integer userId) {
        User user = new User();
        user.setId(userId);
        user.setValidity(Boolean.FALSE);
        SqlStandardControl control = new SqlStandardControl();
        control.setSkipEmptyStatement(true);
        return userDao.update(user, control);
    }

    @Transactional(readOnly = true)
    public User getUser(Integer userId) {
        User user = new User();
        user.setId(userId);
        return userDao.get(user);
    }

    @Transactional(readOnly = true)
    public List<User> getAllUsers() {
        return userDao.list(new User());
    }

}