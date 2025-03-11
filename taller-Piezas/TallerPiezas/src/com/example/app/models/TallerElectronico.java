package com.example.app.models;

import com.example.app.interfaces.CalcularPrecio;
import com.example.app.interfaces.OperacionesSistema;
import com.example.app.interfaces.Reparar;
import com.example.app.utils.TallerException;

import java.util.ArrayList;
import java.util.List;

public class TallerElectronico implements OperacionesSistema, CalcularPrecio {
    private String nombreTallerElectrico;
    private List<Pieza> listaPiezasElectronicas;
    private double precioReparacion;


    public TallerElectronico(String nombreTallerElectrico) {
        this.nombreTallerElectrico = nombreTallerElectrico;
        this.precioReparacion = precioReparacion;
        this.listaPiezasElectronicas = new ArrayList<>();
    }

    public double getPrecioReparacion() {
        return precioReparacion;
    }

    public void setPrecioReparacion(double precioReparacion) {
        this.precioReparacion = precioReparacion;
    }

    public String getNombreTallerElectrico() {
        return nombreTallerElectrico;
    }

    public void setNombreTallerElectrico(String nombreTallerElectrico) {
        this.nombreTallerElectrico = nombreTallerElectrico;
    }

    public List<Pieza> getListaPiezasElectronicas() {
        return listaPiezasElectronicas;
    }

    public void setListaPiezasElectronicas(List<Pieza> listaPiezasElectronicas) {
        this.listaPiezasElectronicas = listaPiezasElectronicas;
    }

    @Override
    public void registraPieza(Pieza pieza) throws TallerException {

        if (pieza != null) {
            listaPiezasElectronicas.add(pieza);
            System.out.println("Pieza registrada: " + pieza.getNombre());
        } else {
            throw new TallerException("La pieza no puede ser nula.");
        }
    }

    @Override
    public void aplicarProcesoPrueba(Pieza pieza) throws TallerException {

        if (pieza.getTipoPrueba() != null) {
            System.out.println("Activando el control de pruebas... ");
        } else {
            throw new TallerException("La pieza no tiene asignado un tipo de Prueba");
        }


    }

    @Override
    public void repararPieza(Pieza pieza) throws TallerException {

        if (pieza.getTipoReparacion() != null) {
            System.out.println("Reparando pieza!! Espere por favor!!!");
        } else {
            throw new TallerException("Esta pieza no se puede reparar");
        }
    }

    @Override
    public void ajustarPieza(Pieza pieza) throws TallerException {

        //ajustarpieza es igual que el metodo calcularPrecioTotal.
    }

    @Override
    public void hacerTodo(List<Pieza> listaPiezas) throws TallerException {

    }

    @Override
    public void calculoPrecioTotal(Pieza p) throws TallerException {

        if (p == null) {
            throw new TallerException("Debe agregar una pieza");
        }

        double nuevoPrecio = p.getPrecio();

        if (p.getTipoPrueba() != null) {
            nuevoPrecio += p.getTipoPrueba().getPrecioTest();  // Precio de la prueba
        }

        if (p.getTipoReparacion() != null) {
            nuevoPrecio += p.getTipoReparacion().getPrecio();  // Precio de la reparación
        }

        System.out.println("El total de la pieza es: " + nuevoPrecio + " € ");
    }
}
