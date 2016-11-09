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

    /**
     * UC1a
     * 
     * @param user
     * @return
     */
    @Transactional
    public User registerUser(User user) {
        return userDao.insert(user);
    }

    /**
     * UC1b
     * 
     * @param user
     * @return
     */
    @Transactional
    public boolean loginUser(User user) {
        // TODO authentication
        return true;
    }

    /**
     * UC1c
     * 
     * @param user
     */
    @Transactional
    public void logoutUser(User user) {
        // TODO authentication
    }

    /**
     * UC1d
     * 
     * @param user
     */
    @Transactional
    public void remindPassword(User user) {
        // TODO reset password
    }

    /**
     * UC1e
     * 
     * @param user
     * @return
     */
    @Transactional
    public int editUser(User user) {
        return userDao.update(user._setNull_(Attribute.values()));
    }

    /**
     * UC1f
     * 
     * @param user
     * @return
     */
    @Transactional(readOnly = true)
    public User getUser(User user) {
        return userDao.get(user);
    }

    /**
     * UC1g
     * 
     * @param user
     * @return
     */
    @Transactional(readOnly = true)
    public User getUser(Integer id) {
        User user = new User();
        user.setId(id);
        return getUser(user);
    }

    /**
     * UC1h
     * 
     * @return
     */
    @Transactional(readOnly = true)
    public List<User> listAllUsers() {
        return userDao.list(new User());
    }

    /**
     * UC1i
     * 
     * @param userId
     * @return
     */
    @Transactional
    public int deleteUser(Integer userId) {
        User user = new User();
        user.setId(userId);
        user.setValidity(Boolean.FALSE);
        SqlStandardControl control = new SqlStandardControl();
        control.setSkipEmptyStatement(true);
        return userDao.update(user, control);
    }

}