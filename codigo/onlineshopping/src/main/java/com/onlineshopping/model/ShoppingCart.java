package com.onlineshopping.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Representa el carrito de la compra de un usuario.
 * 
 * Contiene los productos seleccionados antes de generar un pedido.
 * 
 * @author ENDES
 */
public class ShoppingCart {

    private Date created;
    private List<LineItem> items = new ArrayList<>();

    public ShoppingCart(Date created) {
        this.created = created;
    }

    public Date getCreated() { return created; }
    public List<LineItem> getItems() { return items; }

    /**
     * Añade un producto al carrito.
     */
    public void addItem(LineItem item) {
        items.add(item);
    }

    /**
     * Elimina un producto del carrito.
     */
    public void removeItem(LineItem item) {
        items.remove(item);
    }
}