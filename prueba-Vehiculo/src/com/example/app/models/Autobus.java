package com.example.app.models;


import com.example.app.interfaces.Recoger;

/**
 * The type Autobus.
 */
public class Autobus extends Vehiculo implements Recoger {
    /**
     * Instantiates a new Autobus.
     *
     * @param marca the marca
     */
    public Autobus(String marca) {
        super(marca);
    }

    @Override
    public void acelerar() {

        System.out.println("Autobus acelerando " +getMarca());
    }

    @Override
    public void frenar() {

        System.out.println("Autobus frenando " + getMarca());
    }

    @Override
    public void recogerPasajeros() {

        System.out.println("El autobús: " + getMarca() + "esta recogiendo pasajeros");

    }

    @Override
    public void descargarPasajeros() {

        System.out.println("El autobús: " + getMarca() + "esta descargando pasajeros");
    }
}
