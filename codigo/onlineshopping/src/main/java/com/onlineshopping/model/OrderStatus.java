package com.onlineshopping.model;

/**
 * Enumeración que representa el estado de un pedido.
 * 
 * @author ENDES
 */
public enum OrderStatus {
    NEW,        // Pedido creado
    HOLD,       // En espera
    SHIPPED,    // Enviado
    DELIVERED,  // Entregado
    CLOSED      // Cerrado
}