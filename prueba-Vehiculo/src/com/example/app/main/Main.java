package com.example.app.main;

import com.example.app.interfaces.Movible;
import com.example.app.interfaces.Recoger;
import com.example.app.models.Autobus;
import com.example.app.models.Bicicleta;
import com.example.app.models.Coche;
import com.example.app.models.Vehiculo;
import com.example.app.utils.VehiculoException;

import java.util.ArrayList;

import java.util.List;

/**
 * The type Main.
 */
public class Main {


    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        List<Vehiculo> conjuntoVehiculo = new ArrayList<>();

        //Creando Objetos
        Coche coche1 = new Coche("Renault");
        Coche coche2 = new Coche("Seat");
        Coche coche3 = new Coche("Skoda");

        conjuntoVehiculo.add(coche1);
        conjuntoVehiculo.add(coche2);
        conjuntoVehiculo.add(coche3);

        //  conjuntoVehiculo.forEach(vehiculo -> System.out.println(vehiculo));

        //Autobus
        Autobus autobus1 = new Autobus("Socibus");
        conjuntoVehiculo.add(autobus1);
        // Bicicleta
        Bicicleta bicicleta1 = new Bicicleta("Fixie");
        conjuntoVehiculo.add(bicicleta1);

        //mostando los objetos
        conjuntoVehiculo.forEach(vehiculo -> System.out.println(vehiculo));

        try {

            probarMobilidad(bicicleta1);
         //   probarCargaDescargaPasajero(bicicleta1);
        } catch (VehiculoException e) {
            System.out.println(e.getMessage());
        }


    }

    /**
     * Probabilidad carga.
     */
    public static void probarMobilidad(Vehiculo vehiculo) throws VehiculoException {

        if (vehiculo instanceof Movible mov) {
            mov.acelerar();
            mov.frenar();
        }
        System.out.println("La operacion se ha realizado con éxito");
    }

    public static void probarCargaDescargaPasajero(Vehiculo vehiculo) throws VehiculoException {

        if (vehiculo instanceof Recoger rec) {
            rec.recogerPasajeros();
            rec.descargarPasajeros();
        } else {
            throw new VehiculoException("El vehículo: " + vehiculo.getMarca() + " no puede realizar esa tarea");
        }
    }

}
