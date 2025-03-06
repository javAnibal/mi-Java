package com.example.models;

import com.example.enums.TipoRecinto;
import com.example.utils.EdificioException;

public class EdificioOficinas extends Edificio{
    public EdificioOficinas(int numeroOficinas, TipoRecinto tipoRecinto, String nombre) {
        super(numeroOficinas, TipoRecinto.CUBIERTO, nombre);
    }

    @Override
    public int getTipoDeInstalacion() throws EdificioException {
        return 0;
    }

    @Override
    public double getSuperficieEdificio() throws EdificioException {
        return 0;
    }
}
