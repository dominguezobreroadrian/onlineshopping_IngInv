package com.onlineshopping.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Representa la cuenta de un cliente en el sistema.
 * 
 * Una cuenta gestiona la información de facturación, estado (abierta/cerrada),
 * así como los pedidos y pagos asociados.
 * 
 * Relación: Pertenece a un Customer y contiene múltiples Orders y Payments.
 * 
 * @author ENDES
 */
public class Account {

    private String id;
    private String billingAddress;
    private boolean closed;
    private Date open;
    private Date closedDate;

    private List<Order> orders = new ArrayList<>();
    private List<Payment> payments = new ArrayList<>();

    /**
     * Constructor de Account.
     * 
     * @param id identificador único de la cuenta
     * @param billingAddress dirección de facturación
     * @param open fecha de apertura de la cuenta
     */
    public Account(String id, String billingAddress, Date open) {
        this.id = id;
        this.billingAddress = billingAddress;
        this.open = open;
        this.closed = false;
    }

    /**
     * @return identificador de la cuenta
     */
    public String getId() {
        return id;
    }

    /**
     * @return dirección de facturación
     */
    public String getBillingAddress() {
        return billingAddress;
    }

    /**
     * @return true si la cuenta está cerrada, false en caso contrario
     */
    public boolean isClosed() {
        return closed;
    }

    /**
     * @return fecha de apertura de la cuenta
     */
    public Date getOpen() {
        return open;
    }

    /**
     * @return fecha de cierre de la cuenta (puede ser null si sigue abierta)
     */
    public Date getClosedDate() {
        return closedDate;
    }

    /**
     * @return lista de pedidos asociados a la cuenta
     */
    public List<Order> getOrders() {
        return orders;
    }

    /**
     * @return lista de pagos asociados a la cuenta
     */
    public List<Payment> getPayments() {
        return payments;
    }

    /**
     * Añade un pedido a la cuenta.
     * 
     * @param order pedido a añadir
     */
    public void addOrder(Order order) {
        orders.add(order);
    }

    /**
     * Añade un pago a la cuenta.
     * 
     * @param payment pago a añadir
     */
    public void addPayment(Payment payment) {
        payments.add(payment);
    }

    /**
     * Cierra la cuenta estableciendo la fecha de cierre.
     * 
     * @param date fecha en la que se cierra la cuenta
     */
    public void closeAccount(Date date) {
        this.closed = true;
        this.closedDate = date;
    }
}