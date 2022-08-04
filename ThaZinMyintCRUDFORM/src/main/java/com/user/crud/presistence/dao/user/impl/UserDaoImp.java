package com.user.crud.presistence.dao.user.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;
import com.user.crud.presistence.dao.user.UserDao;
import com.user.crud.presistence.entity.User;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * <h2>UserDaoImp Class</h2>
 * <p>
 * Process for Displaying UserDaoImp
 * </p>
 * 
 * @author ThaZinMyint
 *
 */
@Repository
@Transactional
public class UserDaoImp implements UserDao {
    /**
     * <h2>sessionFactory</h2>
     * <p>
     * sessionFactory
     * </p>
     */
    @Autowired
    private SessionFactory sessionFactory;

    /**
     * <h2>getUserList</h2>
     * <p>
     * 
     * </p>
     * 
     * @return
     */
    @SuppressWarnings("unchecked")
    public List<User> getUserList() {
        return sessionFactory.getCurrentSession().createQuery("from User").list();
    }

    /**
     * <h2>addUser</h2>
     * <p>
     * 
     * </p>
     * 
     * @param user
     */
    public void addUser(User user) {
        sessionFactory.getCurrentSession().saveOrUpdate(user);
    }

    /**
     * <h2>getUser</h2>
     * <p>
     * 
     * </p>
     * 
     * @param userId
     * @return
     */
    @SuppressWarnings("deprecation")
    @Override
    public User getUser(int userId) {
        System.out.println(userId);
        String userHqlQuery = "SELECT u FROM User u where u.id = :id";
        Query queryUserById = this.sessionFactory.getCurrentSession().createQuery(userHqlQuery);
        queryUserById.setParameter("id", userId);
        User resultUser = (User) queryUserById.uniqueResult();
        return resultUser;
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
    public void deleteUser(Integer userId) {
        User user = (User) sessionFactory.getCurrentSession().load(User.class, userId);
        if (null != user) {
            this.sessionFactory.getCurrentSession().delete(user);
        }
    }

    /**
     * <h2>updateUser</h2>
     * <p>
     * 
     * </p>
     * 
     * @param user
     */
    @Override
    public void updateUser(User user) {
        this.sessionFactory.getCurrentSession().update(user);
    }

}