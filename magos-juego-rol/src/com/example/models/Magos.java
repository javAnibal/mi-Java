package com.example.models;

import com.example.enums.TipoRaza;
import com.example.utils.JuegoException;


public class Magos extends Personaje {

    private String[] listaHechizos;

    public Magos(String nombre, TipoRaza raza, int fuerza, int inteligencia, int vidaMaxima, int vidaActual) throws JuegoException {
        super(nombre, raza, fuerza, inteligencia, vidaMaxima, vidaActual);
        this.listaHechizos = new String[4];
    }

    public String[] getListaHechizos() {
        return listaHechizos;
    }

    public void setListaHechizos(String[] listaHechizos) throws JuegoException {

        if (listaHechizos.length > 4) {
            throw new JuegoException("Bolsa de Hechizos llena");
        }
        this.listaHechizos = listaHechizos;
    }

    @Override
    public void setInteligencia(int inteligencia) throws JuegoException {
        if (inteligencia < 17) {
            throw new JuegoException("La inteligencia del Mago no puede ser menor a [17]");
        }
        super.setInteligencia(inteligencia);
    }

    @Override
    public void setFuerza(int fuerza) throws JuegoException {
        if (fuerza > 15) {
            throw new JuegoException("La fuerza del Mago no puede ser mayor a [15]");
        }
        super.setFuerza(fuerza);


    }

    //m() MAGO → IMPLEMENTA PROPIOS METODOS

    public void aprendeHechizo(String newHechizo) throws JuegoException {

        this.setListaHechizos(listaHechizos);

        for (int i = 0; i < listaHechizos.length; i++) {
            if (listaHechizos[i] == null) {
                listaHechizos[i] = newHechizo;
                return;
            }
            if (listaHechizos[i].equalsIgnoreCase(newHechizo)) {
                throw new JuegoException("El hechizo ya ha sido aprendido");
            }

        }


    }


    public void lanzaHechizo(Personaje p, String listaHechizos) throws JuegoException {
        if (p.getVidaActual() > 0) {
            setVidaActual(getVidaActual() - 10);
        }
    }


}
