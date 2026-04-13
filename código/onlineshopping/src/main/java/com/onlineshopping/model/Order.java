package com.onlineshopping.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Representa un pedido realizado por el cliente.
 * 
 * Contiene productos, estado y fechas relevantes.
 * 
 * @author ENDES
 */
public class Order {

    private String number;
    private Date ordered;
    private Date shipped;
    private String shipTo;
    private OrderStatus status;
    private double total;

    private List<LineItem> items = new ArrayList<>();

    /**
     * Constructor de Order.
     * 
     * @param number número identificador del pedido
     * @param ordered fecha de creación
     * @param shipTo dirección de envío
     */
    public Order(String number, Date ordered, String shipTo) {
        this.number = number;
        this.ordered = ordered;
        this.shipTo = shipTo;
        this.status = OrderStatus.NEW;
    }

    /**
     * @return número del pedido
     */
    public String getNumber() {
        return number;
    }

    /**
     * @return fecha de creación
     */
    public Date getOrdered() {
        return ordered;
    }

    /**
     * @return fecha de envío
     */
    public Date getShipped() {
        return shipped;
    }

    /**
     * @return dirección de envío
     */
    public String getShipTo() {
        return shipTo;
    }

    /**
     * @return estado del pedido
     */
    public OrderStatus getStatus() {
        return status;
    }

    /**
     * @return total del pedido
     */
    public double getTotal() {
        return total;
    }

    /**
     * @return lista de productos del pedido
     */
    public List<LineItem> getItems() {
        return items;
    }

    /**
     * Añade un producto al pedido.
     * 
     * @param item línea de producto a añadir
     */
    public void addItem(LineItem item) {
        items.add(item);
        recalculateTotal();
    }

    /**
     * Recalcula el total del pedido.
     */
    private void recalculateTotal() {
        total = items.stream().mapToDouble(LineItem::getTotal).sum();
    }

    /**
     * Marca el pedido como enviado.
     * 
     * @param shippedDate fecha de envío
     */
    public void ship(Date shippedDate) {
        this.shipped = shippedDate;
        this.status = OrderStatus.SHIPPED;
    }
}