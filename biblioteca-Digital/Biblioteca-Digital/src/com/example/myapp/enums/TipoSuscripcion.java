package com.example.myapp.enums;

public enum TipoSuscripcion {

    Basica(2), Premium(5), Vip(10);

    private int librosMax;

    TipoSuscripcion(int librosMax) {
        this.librosMax = librosMax;
    }

    public int getLibrosMax() {
        return librosMax;
    }
}
