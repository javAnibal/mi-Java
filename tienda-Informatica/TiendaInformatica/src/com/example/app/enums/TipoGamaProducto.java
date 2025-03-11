package com.example.app.enums;

public enum TipoGamaProducto {

    Gama_Alta(10), Gama_Baja(15);

    private double precioGama;

    TipoGamaProducto(double precioGama) {
        this.precioGama = precioGama;
    }

    public double getPrecioGama() {
        return precioGama;
    }
}
