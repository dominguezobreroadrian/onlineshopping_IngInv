package com.onlineshopping.model;

/**
 * Enumeración que representa los posibles estados de un usuario web.
 * 
 * @author ENDES
 */
public enum UserState {
    NEW,       // Usuario recién creado
    ACTIVE,    // Usuario activo
    BLOCKED,   // Usuario bloqueado temporalmente
    BANNED     // Usuario expulsado definitivamente
}
