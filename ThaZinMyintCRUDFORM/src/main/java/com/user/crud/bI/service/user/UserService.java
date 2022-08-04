package com.user.crud.bI.service.user;

import java.util.List;

import javax.validation.Valid;
import com.user.crud.presistence.entity.User;
import com.user.crud.web.form.UserForm;

/**
 * <h2>UserService Class</h2>
 * <p>
 * Process for Displaying UserService
 * </p>
 * 
 * @author ThaZinMyint
 *
 */
public interface UserService {
    /**
     * <h2>getUserList</h2>
     * <p>
     * 
     * </p>
     *
     * @return
     * @return List<User>
     */
    List<User> getUserList();

    /**
     * <h2>addUser</h2>
     * <p>
     * 
     * </p>
     *
     * @param userForm
     * @return void
     */
    void addUser(@Valid UserForm userForm);

    /**
     * <h2>getUser</h2>
     * <p>
     * 
     * </p>
     *
     * @param userID
     * @return
     * @return UserForm
     */
    UserForm getUser(int userID);

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
     * @param userForm
     * @return void
     */
    void updateUser(UserForm userForm);

}