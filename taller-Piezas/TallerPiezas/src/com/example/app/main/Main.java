package com.example.app.main;

import com.example.app.enums.TipoReparacion;
import com.example.app.enums.TipoPrueba;
import com.example.app.models.*;

import java.util.ArrayList;
import java.util.List;

public class Main {


    static List<Pieza> listaDePiezas = new ArrayList<>();

    static {


        listaDePiezas.add(new DiscoDuro(1, "Disco Duro Seagate", 100.0, true, TipoPrueba.FULL_TEST, TipoReparacion.REPARACION_SIMPLE));
        listaDePiezas.add(new DiscoDuro(2, "Disco Duro WD", 90.0, true, TipoPrueba.TEST_BASIC, TipoReparacion.REPARACION_MEDIA));
        listaDePiezas.add(new DiscoDuro(3, "Disco Duro Toshiba", 80.0, false, TipoPrueba.FULL_TEST, null)); // Sin reparación

        listaDePiezas.add(new TurboCompresor(1, "TurboCompresor Garrett", 500.0, true, TipoPrueba.TEST_BASIC, TipoReparacion.REPARACION_TOTAL));
        listaDePiezas.add(new TurboCompresor(2, "TurboCompresor BorgWarner", 600.0, true, TipoPrueba.FULL_TEST, TipoReparacion.REPARACION_MEDIA));
        listaDePiezas.add(new TurboCompresor(3, "TurboCompresor Holset", 450.0, false, TipoPrueba.TEST_BASIC, null)); // Sin reparación

    }


    public static void main(String[] args) {


        listaDePiezas.forEach(pieza -> System.out.println(pieza));

        //Haciendo pruebas

        TallerElectronico taller1 = new TallerElectronico("tuPcInformática");



        try {
            taller1.registraPieza(listaDePiezas.get(0));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }






    }
}
