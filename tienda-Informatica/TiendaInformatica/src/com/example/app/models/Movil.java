package com.example.app.models;

import com.example.app.enums.TipoGamaProducto;

public class Movil extends Producto {
    //Atributos Propios
    private String sistemaOperativo;
    private int tamañoPantalla;

    public Movil(String nombre, double precio, int cantidadProducto, TipoGamaProducto tipoGamaProducto, String sistemaOperativo, int tamañoPantalla) {
        super(nombre, precio, cantidadProducto, tipoGamaProducto);
        this.sistemaOperativo = sistemaOperativo;
        this.tamañoPantalla = tamañoPantalla;

    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public int getTamañoPantalla() {
        return tamañoPantalla;
    }

    public void setTamañoPantalla(int tamañoPantalla) {
        this.tamañoPantalla = tamañoPantalla;
    }

    public void mostrardatos(){


    }

    @Override
    public void calcularDescuento() {
        super.calcularDescuento();

    }


    @Override
    public String toString() {
        return super.toString() + "| SSOO: " + sistemaOperativo + " | Pantalla: " + tamañoPantalla + " | Gama: " + getTipoGamaProducto();
    }
}
