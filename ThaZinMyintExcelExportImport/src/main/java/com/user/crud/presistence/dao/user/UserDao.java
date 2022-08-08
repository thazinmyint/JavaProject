package com.user.crud.presistence.dao.user;

import java.util.Date;
import java.util.List;

import com.user.crud.presistence.entity.User;

/**
 * <h2>UserDao Class</h2>
 * <p>
 * Process for Displaying UserDao
 * </p>
 * 
 * @author ThaZinMyint
 *
 */
public interface UserDao {
    /**
     * <h2>getUserList</h2>
     * <p>
     * 
     * </p>
     *
     * @return
     * @return List<User>
     */
    public List<User> getUserList();

    /**
     * <h2>addUser</h2>
     * <p>
     * 
     * </p>
     *
     * @param user
     * @return void
     */
    public void addUser(User user);

    /**
     * <h2>getUser</h2>
     * <p>
     * 
     * </p>
     *
     * @param userId
     * @return
     * @return User
     */
    User getUser(int userId);

    /**
     * <h2>deleteUser</h2>
     * <p>
     * 
     * </p>
     *
     * @param userId
     * @return void
     */
    void deleteUser(Integer userId);

    /**
     * <h2>updateUser</h2>
     * <p>
     * 
     * </p>
     *
     * @param student
     * @return void
     */
    void updateUser(User student);

}