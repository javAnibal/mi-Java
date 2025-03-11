package com.example.app.enums;

public enum TipoReparacion {
    REPARACION_TOTAL(30), REPARACION_MEDIA(15), REPARACION_SIMPLE(10);

    private double precio;

    TipoReparacion(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }
}
