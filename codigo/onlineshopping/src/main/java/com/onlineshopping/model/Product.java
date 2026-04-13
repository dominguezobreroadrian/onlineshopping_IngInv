package com.onlineshopping.model;

/**
 * Representa un producto disponible para la venta.
 * 
 * @author ENDES
 */
public class Product {

    private String id;
    private String name;
    private String supplier;

    public Product(String id, String name, String supplier) {
        this.id = id;
        this.name = name;
        this.supplier = supplier;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getSupplier() { return supplier; }
}