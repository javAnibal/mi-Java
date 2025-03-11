package com.example.app.models;

import com.example.app.enums.TipoPrueba;
import com.example.app.enums.TipoReparacion;

public abstract class Pieza {
    static int contadorPiezas = 1;
    private int idPieza;
    private String nombre;
    private double precio;
    private boolean estado;
    private TipoPrueba tipoPrueba;
    private TipoReparacion tipoReparacion;

    public Pieza(int idPieza, String nombre, double precio, boolean estado, TipoPrueba tipoPrueba, TipoReparacion tipoReparacion) {
        this.idPieza = contadorPiezas++;
        this.nombre = nombre;
        this.precio = precio;
        this.estado = estado;
        this.tipoPrueba = tipoPrueba;
        this.tipoReparacion = tipoReparacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public TipoPrueba getTipoPrueba() {
        return tipoPrueba;
    }

    public void setTipoPrueba(TipoPrueba tipoPrueba) {
        this.tipoPrueba = tipoPrueba;
    }

    public TipoReparacion getTipoReparacion() {
        return tipoReparacion;
    }

    public void setTipoReparacion(TipoReparacion tipoReparacion) {
        this.tipoReparacion = tipoReparacion;
    }

    @Override
    public String toString() {

        return String.format("Id-Pieza: %d | Nombre: %s | Precio: %.2f ", idPieza, nombre, precio);
    }



}
