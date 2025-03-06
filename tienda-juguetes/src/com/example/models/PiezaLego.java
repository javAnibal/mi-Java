package com.example.models;

import com.example.enums.TipoMaterial;
import com.example.interfaces.Apilables;
import com.example.utils.JuguetesException;

public class PiezaLego extends JuguetePlastico implements Apilables {

    private TipoMaterial tipo3;
    private int longitud;
    private String colorLego;


    public PiezaLego(String nombre, String marca, int longitud, String colorLego) {
        super(nombre, marca, TipoMaterial.ABS);
        this.tipo3 = TipoMaterial.ABS;
        this.longitud = longitud;
        this.colorLego = colorLego;
    }

    public TipoMaterial getTipo3() {
        return tipo3;
    }

    public void setTipo3(TipoMaterial tipo3) {
        this.tipo3 = tipo3;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getColorLego() {
        return colorLego;
    }

    public void setColorLego(String colorLego) {
        this.colorLego = colorLego;
    }

    @Override
    public String toString() {
        return super.toString() + " | Tipo material:  " + tipo3 + " | Longitud: " + longitud + " | ColorLego: " + colorLego;
    }

    @Override
    public boolean apilar(Juguete otroJuguete) throws JuguetesException {

        if (otroJuguete instanceof PiezaLego) {
            System.out.println(this.getNombre() + "  - !!Se han apilado!! - " + otroJuguete.getNombre());
            return true;
        } else {
            throw new JuguetesException(" Error!! Los juguetes son imcompatibles");
        }

    }
}
