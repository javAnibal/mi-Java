package com.example.models;

import com.example.enums.TipoRecinto;
import com.example.interfaces.InstalacionDeportiva;
import com.example.utils.EdificioException;

public class Polideportivo extends Edificio implements InstalacionDeportiva {
    public Polideportivo(String nombre, double superficie) {
        super(nombre, TipoRecinto.DELIMITADO, superficie);
    }

    @Override
    public double getSuperficieEdificio() throws EdificioException {
        return getSuperficie();
    }

    @Override
    public int getTipoDeInstalacion() throws EdificioException {
        return 1;
    }
}
