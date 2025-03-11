package com.example.models;

public class InstrumentoMusicalMadera extends JugueteMadera {
    private int edadInstrumento;

    public InstrumentoMusicalMadera(String nombre, String marca, String origen, int añoTala, int edadInstrumento) {
        super(nombre, marca, origen, añoTala);
        this.edadInstrumento = edadInstrumento;
    }

    public int getEdadInstrumento() {
        return edadInstrumento;
    }

    public void setEdadInstrumento(int edadInstrumento) {
        this.edadInstrumento = edadInstrumento;
    }

    @Override
    public String toString() {
        return super.toString() + " | Edad Instrumento: " + edadInstrumento;
    }
}
