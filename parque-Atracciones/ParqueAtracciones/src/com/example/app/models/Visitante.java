package com.example.app.models;

import com.example.app.enums.TipoEntrada;
import com.example.app.utils.AtraccionException;

public class Visitante {
    private String nombre;
    private TipoEntrada tipoEntrada;

    public Visitante(String nombre, TipoEntrada tipoEntrada) {
        this.nombre = nombre;
        this.tipoEntrada = tipoEntrada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoEntrada getTipoEntrada() {
        return tipoEntrada;
    }

    public void setTipoEntrada(TipoEntrada tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    public void accederAtraccion(Atraccion atraccion) throws AtraccionException {

        if(atraccion.getCapacidadActual() >= atraccion.getCapacidadMaxVisitantes()){
            throw new AtraccionException("La atraccion no tiene sitio disponible");
        }

        if(atraccion.isPermiteVip() && this.tipoEntrada == TipoEntrada.VIP){
            atraccion.agregaVisitante(this,atraccion);

        } else if (!atraccion.isPermiteVip() && this.tipoEntrada == TipoEntrada.VIP) {
            throw new AtraccionException("La atraccion no permite visitante VIP");

        }


    }
}
