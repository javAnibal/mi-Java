package com.example.app.models;

public class Bicicleta extends Vehiculo {
    public Bicicleta(String marca) {
        super(marca);
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando bicicleta " + getMarca());

    }

    @Override
    public void frenar() {

        System.out.println("Frenando bicicleta " + getMarca());
    }
}
