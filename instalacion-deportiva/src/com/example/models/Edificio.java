package com.example.models;


import com.example.enums.TipoRecinto;
import com.example.interfaces.Construccion;

public abstract class Edificio implements Construccion {

    private int numeroOficinas;
    private TipoRecinto tipoRecinto;
    private String nombre;

    public Edificio(int numeroOficinas, TipoRecinto tipoRecinto, String nombre) {
        this.numeroOficinas = numeroOficinas;
        this.tipoRecinto = tipoRecinto;
        this.nombre = nombre;
    }

    public int getNumeroOficinas() {
        return numeroOficinas;
    }

    public void setNumeroOficinas(int numeroOficinas) {
        this.numeroOficinas = numeroOficinas;
    }

    public TipoRecinto getTipoRecinto() {
        return tipoRecinto;
    }

    public void setTipoRecinto(TipoRecinto tipoRecinto) {
        this.tipoRecinto = tipoRecinto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Edificio{" +
                "numeroOficinas=" + numeroOficinas +
                ", tipoRecinto=" + tipoRecinto +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
