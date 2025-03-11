package com.example.app.interfaces;

import com.example.app.models.Pieza;
import com.example.app.utils.TallerException;

public interface CalcularPrecio {

    void calculoPrecioTotal(Pieza p) throws TallerException;
}
