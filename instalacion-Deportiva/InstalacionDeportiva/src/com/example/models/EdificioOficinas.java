package com.example.models;

import com.example.enums.TipoRecinto;
import com.example.utils.EdificioException;

public class EdificioOficinas extends Edificio {
    private int numOficinas;
    public EdificioOficinas(String nombre, double superficie, int numOficinas) {
        super(nombre, TipoRecinto.CUBIERTO, superficie);
        this.numOficinas = numOficinas;
    }

    public int getNumOficinas() {
        return numOficinas;
    }

    public void setNumOficinas(int numOficinas) {
        this.numOficinas = numOficinas;
    }

    @Override
    public double getSuperficieEdificio() throws EdificioException {
        return 0;
    }
}
