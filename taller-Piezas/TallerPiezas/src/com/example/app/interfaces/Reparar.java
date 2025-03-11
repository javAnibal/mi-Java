package com.example.app.interfaces;


import com.example.app.models.Pieza;
import com.example.app.utils.TallerException;


public interface Reparar {

    void reparacion(Pieza pieza) throws TallerException;


}
