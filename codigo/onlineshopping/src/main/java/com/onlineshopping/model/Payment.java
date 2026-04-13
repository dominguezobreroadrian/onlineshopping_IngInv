package com.onlineshopping.model;

import java.util.Date;

/**
 * Representa un pago realizado por el cliente.
 * 
 * @author ENDES
 */
public class Payment {

    private String id;
    private Date paid;
    private double total;
    private String details;

    /**
     * Constructor de Payment.
     * 
     * @param id identificador del pago
     * @param paid fecha del pago
     * @param total importe total
     * @param details detalles del pago
     */
    public Payment(String id, Date paid, double total, String details) {
        this.id = id;
        this.paid = paid;
        this.total = total;
        this.details = details;
    }

    /**
     * @return identificador del pago
     */
    public String getId() {
        return id;
    }

    /**
     * @return fecha del pago
     */
    public Date getPaid() {
        return paid;
    }

    /**
     * @return importe del pago
     */
    public double getTotal() {
        return total;
    }

    /**
     * @return detalles del pago
     */
    public String getDetails() {
        return details;
    }
}