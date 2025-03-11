package com.example.app.models;

import com.example.app.enums.TipoGamaProducto;

public class Laptop extends Producto {
    private double capacidadAlmacenamiento;
    private String tipoProcesador;

    public Laptop(String nombre, double precio, int cantidadProducto, TipoGamaProducto tipoGamaProducto, double capacidadAlmacenamiento, String tipoProcesador) {
        super(nombre, precio, cantidadProducto, tipoGamaProducto);
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
        this.tipoProcesador = tipoProcesador;
    }

    public double getCapacidadAlmacenamiento() {
        return capacidadAlmacenamiento;
    }

    public void setCapacidadAlmacenamiento(double capacidadAlmacenamiento) {
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
    }

    public String getTipoProcesador() {
        return tipoProcesador;
    }

    public void setTipoProcesador(String tipoProcesador) {
        this.tipoProcesador = tipoProcesador;
    }

    @Override
    public void calcularDescuento() {
        super.calcularDescuento();
    }
}
