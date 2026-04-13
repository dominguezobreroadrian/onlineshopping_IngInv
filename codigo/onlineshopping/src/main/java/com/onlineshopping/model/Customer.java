package com.onlineshopping.model;
/**
 * Representa un cliente del sistema.
 * 
 * Contiene información de contacto y su cuenta asociada.
 * 
 * @author ENDES
 */
public class Customer {

    private String id;
    private String address;
    private String phone;
    private String email;
    private Account account;

    public Customer(String id, String address, String phone, String email) {
        this.id = id;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public String getId() { return id; }
    public String getAddress() { return address; }
    public String getPhone() { return phone; }
    public String getEmail() { return email; }
    public Account getAccount() { return account; }

    /**
     * 
     * @param account
     */
    public void setAccount(Account account) {
        this.account = account;
    }
}