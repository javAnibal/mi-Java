package com.example.models;

import com.example.enums.TipoMaterial;

public class VehiculoPlastico extends JuguetePlastico {
    private TipoMaterial tipo2;
    private int numRuedas;

    public VehiculoPlastico(String nombre, String marca, TipoMaterial tipo, TipoMaterial tipo2) {
        super(nombre, marca, tipo);
        this.tipo2 = TipoMaterial.PVC;
        this.numRuedas = numRuedas;
    }

    public TipoMaterial getTipo2() {
        return tipo2;
    }

    public void setTipo2(TipoMaterial tipo2) {
        this.tipo2 = tipo2;
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }

    @Override
    public String toString() {
        return super.toString() + " | Tipo material: " + tipo2 + " | NumRuedas: " + numRuedas;
    }
}
