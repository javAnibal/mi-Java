package com.example.app.models;

import com.example.app.interfaz.Interactivo;

public class Espectaculo extends Atraccion implements Interactivo {
    public Espectaculo(String nombre, int capacidadMaxVisitantes) {
        super(nombre, capacidadMaxVisitantes);
    }

    @Override
    public void realizaEspectaculo() {

    }

    @Override
    public void iniciar() {

    }

    @Override
    public void detener() {

    }
}
