package com.example.app.interfaces;

import com.example.app.models.Pieza;
import com.example.app.utils.TallerException;

import java.util.List;

public interface OperacionesSistema {

    void registraPieza(Pieza pieza) throws TallerException;

    void aplicarProcesoPrueba(Pieza pieza) throws TallerException;

    void repararPieza(Pieza pieza) throws TallerException;

    void ajustarPieza(Pieza pieza) throws TallerException;

    void hacerTodo(List<Pieza> listaPiezas) throws TallerException;

}
