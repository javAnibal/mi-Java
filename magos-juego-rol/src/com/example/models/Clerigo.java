package com.example.models;

import com.example.enums.TipoRaza;
import com.example.utils.JuegoException;

import javax.swing.plaf.PanelUI;

public class Clerigo extends Personaje {
    private String dios;

    public Clerigo(String nombre, TipoRaza raza, int fuerza, int inteligencia, int vidaMaxima, int vidaActual, String dios) throws JuegoException {
        super(nombre, raza, fuerza, inteligencia, vidaMaxima, vidaActual);
        this.dios = dios; // El enunciado pide almacenar 1 dios
    }


    @Override
    public void setFuerza(int fuerza) throws JuegoException {
        if (fuerza < 18) {
            throw new JuegoException("Un Clerigo no puede tener una fuerza menor a [18]");
        }
        super.setFuerza(fuerza);
    }

    @Override
    public void setInteligencia(int inteligencia) throws JuegoException {
        if (inteligencia < 12 || inteligencia > 16) {
            throw new JuegoException("La inteligencia del Clérigo se debe establecer entre → [12 - 16]");
        }
        super.setInteligencia(inteligencia);
    }


    //M() CLÉRIGO IMPLIMENTA PROPIOS METODOS

    public void curar(Personaje p) throws JuegoException {

        int curacion = p.getVidaActual() + 10;

        if (curacion > p.getVidaMaxima()) {
            p.setVidaActual(p.getVidaMaxima());//→ no se suma se establece la vida máxima

        } else {
            p.setVidaActual(curacion);
        }


    }

    @Override
    public String toString() {
        return super.toString() + "Dios: " + dios;
    }
}
