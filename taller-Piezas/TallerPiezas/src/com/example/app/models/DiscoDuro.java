package com.example.app.models;

import com.example.app.enums.TipoPrueba;
import com.example.app.enums.TipoReparacion;


public class DiscoDuro extends Pieza  {
    public DiscoDuro(int idPieza, String nombre, double precio, boolean estado, TipoPrueba tipoPrueba, TipoReparacion tipoReparacion) {
        super(idPieza, nombre, precio, estado, tipoPrueba, tipoReparacion);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
