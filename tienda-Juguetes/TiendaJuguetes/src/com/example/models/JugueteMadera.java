package com.example.models;

import com.example.utils.JuguetesException;

import java.time.Year;

public class JugueteMadera extends Juguete {

    //atributos adicionales
    private String origen;
    private int añoTala;

    public JugueteMadera(String nombre, String marca, String origen, int añoTala) {
        super(nombre, marca);
        this.origen = (origen == null) ? "España" : origen;
        // Lo podria hacer con Enum tamb, pero he optado por el operador ternario.
        // aqui declaramos que si origen esta vacio y esa condicion es TRUE por defecto se asigna ESPAÑA, : orrigen
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public int getAñoTala() {
        return añoTala;
    }

    public void setAñoTala(int añoTala) throws JuguetesException {
        if(añoTala <0) {
            throw new JuguetesException("Error!, ha ingresado una fecha incorrecta");
        } else if (añoTala  > Year.now().getValue()) {
            throw  new JuguetesException("Error!, ha ingreado una fecha futura");

        }
        this.añoTala = añoTala;
    }

    @Override
    public String toString() {
        return super.toString() + " | Origen:  "+ origen + "| Año Tala: " + añoTala;
    }
}
