package com.user.crud.presistence.entity;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.user.crud.web.form.UserForm;

/**
 * <h2>User Class</h2>
 * <p>
 * Process for Displaying User
 * </p>
 * 
 * @author ThaZinMyint
 *
 */
@Entity
@Table(name = "user")
public class User {
    /**
     * <h2>id</h2>
     * <p>
     * id
     * </p>
     */
    private int id;
    /**
     * <h2>name</h2>
     * <p>
     * name
     * </p>
     */
    private String name;
    /**
     * <h2>email</h2>
     * <p>
     * email
     * </p>
     */
    private String email;
    /**
     * <h2>address</h2>
     * <p>
     * address
     * </p>
     */
    private String address;

    /**
     * <h2>Constructor for User</h2>
     * <p>
     * Constructor for User
     * </p>
     */
    public User() {
        super();
    }

    /**
     * <h2>getId</h2>
     * <p>
     * 
     * </p>
     *
     * @return
     * @return int
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    /**
     * <h2>setId</h2>
     * <p>
     * 
     * </p>
     *
     * @param int
     * @return void
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * <h2>getName</h2>
     * <p>
     * 
     * </p>
     *
     * @return
     * @return String
     */
    @Column(name = "name")
    public String getName() {
        return name;
    }

    /**
     * <h2>setName</h2>
     * <p>
     * 
     * </p>
     *
     * @param name
     * @return void
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <h2>getEmail</h2>
     * <p>
     * 
     * </p>
     *
     * @return
     * @return String
     */
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    /**
     * <h2>setEmail</h2>
     * <p>
     * 
     * </p>
     *
     * @param email
     * @return void
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * <h2>getAddress</h2>
     * <p>
     * 
     * </p>
     *
     * @return
     * @return String
     */
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    /**
     * <h2>setAddress</h2>
     * <p>
     * 
     * </p>
     *
     * @param address
     * @return void
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * <h2>Constructor for User</h2>
     * <p>
     * Constructor for User
     * </p>
     * 
     * @param userForm
     */
    public User(UserForm userForm) {
        this.id = userForm.getId();
        this.name = userForm.getName();
        this.email = userForm.getEmail();
        this.address = userForm.getAddress();

    }
}