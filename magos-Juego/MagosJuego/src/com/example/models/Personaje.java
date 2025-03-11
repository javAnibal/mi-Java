package com.example.models;

import com.example.enums.TipoRaza;
import com.example.utils.JuegoException;

public abstract class Personaje {

    private String nombre;
    private TipoRaza raza;
    private int fuerza;
    private int inteligencia;
    private int vidaMaxima;
    private int vidaActual;

    public Personaje(String nombre, TipoRaza raza, int fuerza, int inteligencia, int vidaMaxima, int vidaActual) throws JuegoException {
        setNombre(nombre);
        setRaza(raza);
        setFuerza(fuerza);
        setInteligencia(inteligencia);
        setVidaMaxima(vidaMaxima);
        setVidaActual(vidaActual);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws JuegoException {

        if (nombre == null || nombre.trim().isEmpty()) {
            throw new JuegoException("El nombre no puede estar vacío");
        }
        if(nombre.length() < 3 || nombre.length() >30){
            throw new JuegoException("Debe ingresar un nombre válido");
        }

        this.nombre = nombre;
    }

    public TipoRaza getRaza() {
        return raza;
    }

    public void setRaza(TipoRaza raza) throws JuegoException{
        if(raza == null){
            throw new JuegoException("Debe asignar una raza al personaje");
        }

        this.raza = raza;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) throws JuegoException {
        if (fuerza < 0 || fuerza > 20) {
            throw new JuegoException("La fuerza debe establecerse entre [0 - 20]");
        }

        this.fuerza = fuerza;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) throws JuegoException {
        if (inteligencia < 0 || inteligencia > 20) {
            throw new JuegoException("La inteligencia debe establecerse entre [0 - 20]");
        }
        this.inteligencia = inteligencia;
    }

    public int getVidaMaxima() {
        return vidaMaxima;
    }

    public void setVidaMaxima(int vidaMaxima) throws JuegoException {
        if (vidaMaxima < 0 || vidaMaxima > 100) {
            throw new JuegoException("La vida máxima debe estar entre [0 - 100]");
        }
        if (vidaActual > vidaMaxima) {
            throw new JuegoException("Incoherencia!! La vida actual no puede superar la vida máxima");
        }
        this.vidaMaxima = vidaMaxima;
    }

    public int getVidaActual() {
        return vidaActual;
    }

    public void setVidaActual(int vidaActual) throws JuegoException {
        if (vidaActual < 0 || vidaActual > this.vidaMaxima) {
            throw new JuegoException("Incoherencia!! La vida actual no puede ser menor a 0 ni mayor a la vida máxima");
        }
        this.vidaActual = vidaActual;
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s | Raza: %s | Fuerza: %d | Inteligencia: %d | VidaMax: %d | VidaActual: %d ", nombre, raza, fuerza, inteligencia, vidaMaxima, vidaActual);
    }
}
