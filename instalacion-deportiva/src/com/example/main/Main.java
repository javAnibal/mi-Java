package com.example.main;

import com.example.models.Edificio;
import com.example.models.EdificioOficinas;
import com.example.models.Polideportivo;
import com.example.utils.EdificioException;

public class Main {

    public static void main(String[] args) {

        Edificio[] edificios = {
                new Polideportivo("Polideportivo A", 500),
                new Polideportivo("Polideportivo B", 600),
                new Polideportivo("Polideportivo C", 700),
                new EdificioOficinas("Edificio Oficinas 1", 800, 10),
                new EdificioOficinas("Edificio Oficinas 2", 900, 15)
        };
        try {
            mostrarEdificios(edificios);
        } catch (EdificioException e) {
            System.out.println(e.getMessage());
            ;
        }


    }


    public static void mostrarEdificios(Edificio[] edificios) throws EdificioException {

        for (int i = 0; i < edificios.length; i++) {
            if (edificios == null) {
                throw new EdificioException("No hay edificios para mostrar");
            }
            System.out.println(edificios[i]);

        }
    }
}
