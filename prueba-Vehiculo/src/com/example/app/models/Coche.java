package com.example.app.models;

import com.example.app.interfaces.Recoger;

public class Coche extends Vehiculo implements Recoger {
    public Coche(String marca) {
        super(marca);
    }

    @Override
    public void acelerar() {
        System.out.println("Coche acelerando " + getMarca());

    }

    @Override
    public void frenar() {
        System.out.println("Coche frenando " + getMarca());
    }

    @Override
    public void recogerPasajeros() {
        System.out.println("El coche: " + getMarca() + "esta recogiendo pasajeros");

    }

    @Override
    public void descargarPasajeros() {
        System.out.println("El coche: " + getMarca() + "esta recogiendo pasajeros");
    }

}
