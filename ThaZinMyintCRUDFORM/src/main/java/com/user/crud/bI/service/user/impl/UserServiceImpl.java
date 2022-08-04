package com.user.crud.bI.service.user.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.user.crud.bI.service.user.UserService;
import com.user.crud.presistence.dao.user.UserDao;
import com.user.crud.presistence.entity.User;
import com.user.crud.web.form.UserForm;

/**
 * <h2>UserServiceImpl Class</h2>
 * <p>
 * Process for Displaying UserServiceImpl
 * </p>
 * 
 * @author ThaZinMyint
 *
 */
@Transactional
@Service
public class UserServiceImpl implements UserService {
    /**
     * <h2>userDao</h2>
     * <p>
     * userDao
     * </p>
     */
    @Autowired
    private UserDao userDao;

    /**
     * <h2>getUserList</h2>
     * <p>
     * 
     * </p>
     * 
     * @return
     */
    @Override
    @Transactional
    public List<User> getUserList() {
        return userDao.getUserList();
    }

    /**
     * <h2>addUser</h2>
     * <p>
     * 
     * </p>
     * 
     * @param userForm
     */
    @Override
    @Transactional
    public void addUser(UserForm userForm) {
        User user = new User(userForm);
        this.userDao.addUser(user);
    }

    /**
     * <h2>getUser</h2>
     * <p>
     * 
     * </p>
     * 
     * @param userID
     * @return
     */
    @Override
    @Transactional
    public UserForm getUser(int userID) {
        User resultPost = this.userDao.getUser(userID);
        UserForm resultPostform = resultPost != null ? new UserForm(resultPost) : null;

        return resultPostform;
    }

    /**
     * <h2>deleteUser</h2>
     * <p>
     * 
     * </p>
     * 
     * @param userId
     */
    @Override
    @Transactional
    public void deleteUser(Integer userId) {
        userDao.deleteUser(userId);
    }

    /**
     * <h2>updateUser</h2>
     * <p>
     * 
     * </p>
     * 
     * @param userForm
     */
    @Override
    public void updateUser(UserForm userForm) {
        User updateUser = this.userDao.getUser(userForm.getId());
        updateUser.setName(userForm.getName());
        updateUser.setEmail(userForm.getEmail());
        updateUser.setAddress(userForm.getAddress());
        this.userDao.updateUser(updateUser);
    }

}