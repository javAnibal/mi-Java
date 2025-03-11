package com.example.app.models;

import com.example.app.interfaces.CalcularPrecio;
import com.example.app.interfaces.OperacionesSistema;
import com.example.app.utils.TallerException;

import java.util.ArrayList;
import java.util.List;

public class TallerMecanico implements OperacionesSistema, CalcularPrecio {
    private String nombre;
    private List<Pieza> listaPiezasMecanicas;

    public TallerMecanico(String nombre, List<Pieza> listaPiezasMecanicas) {
        this.nombre = nombre;
        this.listaPiezasMecanicas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Pieza> getListaPiezasMecanicas() {
        return listaPiezasMecanicas;
    }

    public void setListaPiezasMecanicas(List<Pieza> listaPiezasMecanicas) {
        this.listaPiezasMecanicas = listaPiezasMecanicas;
    }

    @Override
    public void registraPieza(Pieza pieza) throws TallerException {
        if (this.listaPiezasMecanicas == null){
            this.listaPiezasMecanicas = new ArrayList<>();
        }



    }

    @Override
    public void aplicarProcesoPrueba(Pieza pieza) throws TallerException {

    }

    @Override
    public void repararPieza(Pieza pieza) throws TallerException {

    }

    @Override
    public void ajustarPieza(Pieza pieza) throws TallerException {

    }

    @Override
    public void hacerTodo(List<Pieza> listaPiezas) throws TallerException {

    }

    @Override
    public void calculoPrecioTotal(Pieza p) throws TallerException {

    }
}
