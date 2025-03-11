package com.example.app.models;

import com.example.app.enums.TipoPrueba;
import com.example.app.enums.TipoReparacion;

public class TurboCompresor extends Pieza {
    public TurboCompresor(int idPieza, String nombre, double precio, boolean estado, TipoPrueba tipoPrueba, TipoReparacion tipoReparacion) {
        super(idPieza, nombre, precio, estado, tipoPrueba, tipoReparacion);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
