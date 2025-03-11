package com.example.models;

import com.example.interfaces.Apilables;
import com.example.utils.JuguetesException;

public class FiguraMadera extends JugueteMadera implements Apilables {
    //atributos adicionales

    private String color;
    private int numeroLados;


    public FiguraMadera(String nombre, String marca, String origen, int añoTala, String color, int numeroLados) {
        super(nombre, marca, origen, añoTala);
        this.color = color;
        this.numeroLados = numeroLados;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumeroLados() {
        return numeroLados;
    }

    public void setNumeroLados(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    @Override
    public String toString() {
        return super.toString() + " | Color: " + color + " | NumLados: " + numeroLados;
    }


    @Override
    public boolean apilar(Juguete otroJuguete) throws JuguetesException {

        if (otroJuguete instanceof JugueteMadera j) {
            System.out.println(this.getNombre() + " Se han apilado " + otroJuguete.getNombre());
            return true;
        } else {
            throw new JuguetesException("Error!! Los juguetes no son compatibles");
        }

    }
}
