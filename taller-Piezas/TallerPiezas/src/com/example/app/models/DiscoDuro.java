package com.example.app.models;

import com.example.app.enums.TipoPrueba;
import com.example.app.enums.TipoReparacion;
import com.example.app.interfaces.Reparar;
import com.example.app.utils.TallerException;


public class DiscoDuro extends Pieza implements Reparar {
    public DiscoDuro(int idPieza, String nombre, double precio, boolean estado, TipoPrueba tipoPrueba, TipoReparacion tipoReparacion) {
        super(idPieza, nombre, precio, estado, tipoPrueba, tipoReparacion);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void reparacion(Pieza pieza) throws TallerException {

    }
}
