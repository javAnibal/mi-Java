package com.example.models;

import com.example.enums.TipoMaterial;

public class JuguetePlastico extends Juguete{
    //atributos adicionales
    private TipoMaterial tipo;


    public JuguetePlastico(String nombre, String marca, TipoMaterial tipo) {
        super(nombre, marca);
        this.tipo = tipo;
    }

    public TipoMaterial getTipo() {
        return tipo;
    }

    public void setTipo(TipoMaterial tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString()+"| Tipo de material: " + tipo;
    }
}
