package com.onlineshopping.model;

/**
 * Representa una línea de pedido o carrito.
 * 
 * Contiene un producto, su cantidad y precio.
 * 
 * @author ENDES
 */
public class LineItem {

    private int quantity;
    private double price;
    private Product product;

    /**
     * Constructor de LineItem.
     * 
     * @param quantity cantidad del producto
     * @param price precio unitario
     * @param product producto asociado
     */
    public LineItem(int quantity, double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    /**
     * @return cantidad de productos
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @return precio unitario
     */
    public double getPrice() {
        return price;
    }

    /**
     * @return producto asociado
     */
    public Product getProduct() {
        return product;
    }

    /**
     * Calcula el total de la línea.
     * 
     * @return importe total (cantidad * precio)
     */
    public double getTotal() {
        return quantity * price;
    }
}