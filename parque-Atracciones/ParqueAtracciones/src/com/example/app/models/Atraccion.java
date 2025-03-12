package com.example.app.models;

import com.example.app.interfaz.Operable;

import java.util.Arrays;


public abstract class Atraccion implements Operable {

    protected String nombre;
    protected int capacidadMaxVisitantes;
    protected int capacidadActual;
    protected Visitante[] visitantes;
    protected boolean permiteVip;

    public Atraccion(String nombre, int capacidadMaxVisitantes) {
        this.nombre = nombre;
        this.capacidadMaxVisitantes = capacidadMaxVisitantes;
        this.capacidadActual = 0;
        this.visitantes = new Visitante[capacidadMaxVisitantes];
        this.permiteVip = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidadMaxVisitantes() {
        return capacidadMaxVisitantes;
    }

    public void setCapacidadMaxVisitantes(int capacidadMaxVisitantes) {
        this.capacidadMaxVisitantes = capacidadMaxVisitantes;
    }

    public int getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

    public Visitante[] getVisitantes() {
        return visitantes;
    }

    public void setVisitantes(Visitante[] visitantes) {
        this.visitantes = visitantes;
    }

    public boolean isPermiteVip() {
        return permiteVip;
    }

    public void setPermiteVip(boolean permiteVip) {
        this.permiteVip = permiteVip;
    }

    @Override
    public String toString() {
        return "Atraccion{" +
                "nombre='" + nombre + '\'' +
                ", capacidadMaxVisitantes=" + capacidadMaxVisitantes +
                ", capacidadActual=" + capacidadActual +
                ", visitantes=" + Arrays.toString(visitantes) +
                ", permiteVip=" + permiteVip +
                '}';
    }

    public void agregaVisitante(Visitante visitante, Atraccion atraccion) {

        if (capacidadActual < capacidadMaxVisitantes) {
            for (int i = 0; i < visitantes.length; i++) {
                if (visitantes[i] == null) {
                    visitantes[i] = visitante;
                    capacidadActual++;
                    System.out.println("El visitante: " + visitante.getNombre() + " esta en la atraccion " + atraccion.getNombre());
                    break;
                }
            }
        }
    }
}


