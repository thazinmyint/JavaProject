package com.user.crud.web.form;

import javax.validation.constraints.Email;

import javax.validation.constraints.NotEmpty;

import com.user.crud.presistence.entity.User;

/**
 * <h2>UserForm Class</h2>
 * <p>
 * Process for Displaying UserForm
 * </p>
 * 
 * @author ThaZinMyint
 *
 */
public class UserForm {
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
    @NotEmpty
    private String name;

    /**
     * <h2>email</h2>
     * <p>
     * email
     * </p>
     */
    @Email
    @NotEmpty
    private String email;
    /**
     * <h2>address</h2>
     * <p>
     * address
     * </p>
     */
    @NotEmpty
    private String address;

    /**
     * <h2>getId</h2>
     * <p>
     * 
     * </p>
     *
     * @return
     * @return int
     */
    public int getId() {
        return id;
    }

    /**
     * <h2>setId</h2>
     * <p>
     * 
     * </p>
     *
     * @param id
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
     * <h2>Constructor for UserForm</h2>
     * <p>
     * Constructor for UserForm
     * </p>
     */
    public UserForm() {
        super();
    }

    /**
     * <h2>Constructor for UserForm</h2>
     * <p>
     * Constructor for UserForm
     * </p>
     * 
     * @param user
     */
    public UserForm(User user) {
        super();
        this.id = user.getId();
        this.name = user.getName();
        this.email = user.getEmail();
        this.address = user.getAddress();

    }
}