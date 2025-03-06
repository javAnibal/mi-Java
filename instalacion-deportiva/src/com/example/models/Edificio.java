package com.example.models;


import com.example.enums.TipoRecinto;

public class Edificio extends InstalacionDeportiva{

    private int numeroOficinas;

    public Edificio(String nombreInstalacion, TipoRecinto tipoRecinto, double superficie) {
        super(nombreInstalacion, tipoRecinto, superficie);
    }


    public int getNumeroOficinas() {
        return numeroOficinas;
    }

    public void setNumeroOficinas(int numeroOficinas) {
        this.numeroOficinas = numeroOficinas;
    }

    @Override
    public String toString() {
        return "Edificio{" +
                "numeroOficinas=" + numeroOficinas +
                '}';
    }
}
