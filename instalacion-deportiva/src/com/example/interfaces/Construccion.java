package com.example.interfaces;

import com.example.utils.EdificioException;

public interface Construccion {

    int getTipoDeInstalacion() throws EdificioException;

    double getSuperficieEdificio() throws EdificioException;
}
