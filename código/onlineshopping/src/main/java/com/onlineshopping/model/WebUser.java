package com.onlineshopping.model;

/**
 * Clase que representa un usuario del sistema con acceso web.
 * 
 * Relación: Puede estar asociado a un Customer.
 * 
 * @author ENDES
 */
public class WebUser {

    private String loginId;
    private String password;
    private UserState state;
    private Customer customer;

    /**
     * Constructor de WebUser.
     * 
     * @param loginId identificador de login del usuario
     * @param password contraseña del usuario
     * @param state estado inicial del usuario
     */
    public WebUser(String loginId, String password, UserState state) {
        this.loginId = loginId;
        this.password = password;
        this.state = state;
    }

    /**
     * @return identificador de login
     */
    public String getLoginId() {
        return loginId;
    }

    /**
     * @return contraseña del usuario
     */
    public String getPassword() {
        return password;
    }

    /**
     * @return estado del usuario
     */
    public UserState getState() {
        return state;
    }

    /**
     * @return cliente asociado
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Asocia un cliente a este usuario.
     * 
     * @param customer cliente a asociar
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}