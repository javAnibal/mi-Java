package com.example.app.models;

import com.example.app.utils.AtraccionException;

public class AtracMecanica extends Atraccion {

    private int velocidadMax;
    private int velocidadActual;

    public AtracMecanica(String nombre, int capacidadMaxVisitantes, int velocidadMax, int velocidadActual) {
        super(nombre, capacidadMaxVisitantes);
        this.velocidadMax = velocidadMax;
        this.velocidadActual = velocidadActual;
    }

    public int getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(int velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    @Override
    public void iniciar() {

    }

    @Override
    public void detener() {

    }


    public void ajustarVelocidad(int velocidad) throws AtraccionException {

        if (velocidad < 0) {
            throw new AtraccionException("No se puede asignar valores negativos");
        }
        int ajusteVelocidad = (velocidad + velocidadActual);

        if (ajusteVelocidad <= velocidadMax) {
            this.velocidadActual += velocidad;
        } else {
            this.velocidadActual = velocidadMax;
            throw new AtraccionException("La atracción alacanzado la velocidad máxima");
        }

    }
}
