package com.example.models;

public abstract class Juguete {
    private String nombre;
    private String marca;

    public Juguete(String nombre, String marca) {
        this.nombre = nombre;
        this.marca = marca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s, | Marca: %s", nombre, marca);
    }
}
