package com.example.app.models;

import com.example.app.interfaces.Movible;

public abstract class Vehiculo implements Movible {
    private String marca;

    public Vehiculo(String marca) {

        if (marca == null) {
            System.out.println("El nombre no puede estar vacío");
        }
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return String.format("Vehiculo: %s ", marca);
    }
}
