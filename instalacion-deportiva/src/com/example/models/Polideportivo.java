package com.example.models;

import com.example.enums.TipoRecinto;
import com.example.utils.EdificioException;

public class Polideportivo extends InstalacionDeportiva{
    public Polideportivo(String nombreInstalacion, TipoRecinto tipoRecinto, double superficie) {
        super(nombreInstalacion, TipoRecinto.DELIMITADO, superficie);
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
