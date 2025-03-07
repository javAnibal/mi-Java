package com.example.models;

import com.example.enums.TipoRecinto;
import com.example.interfaces.Construccion;

public abstract class Edificio implements Construccion {
    private String nombre;
    private TipoRecinto tipoRecinto;
    private double superficie;

    public Edificio(String nombre, TipoRecinto tipoRecinto, double superficie) {
        this.nombre = nombre;
        this.tipoRecinto = tipoRecinto;
        this.superficie = superficie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoRecinto getTipoRecinto() {
        return tipoRecinto;
    }

    public void setTipoRecinto(TipoRecinto tipoRecinto) {
        this.tipoRecinto = tipoRecinto;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    @Override
    public String toString() {
        return String.format("Edificio:\n" +
                        "  Nombre: %s\n" +
                        "  Tipo de Recinto: %s\n" +
                        "  Superficie: %.2f m²",
                nombre, tipoRecinto, superficie);
    }

}
