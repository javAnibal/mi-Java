package com.example.app;

import com.example.enums.TipoMaterial;
import com.example.models.FiguraMadera;
import com.example.models.PiezaLego;
import com.example.utils.JuguetesException;

public class Main {




    public static void main(String[] args) {

        FiguraMadera fig1 = new FiguraMadera("Caballo Troyano","Hacendado","", 1980, "Café",2);
        FiguraMadera fig2 = new FiguraMadera("Rey Espartano","Hacendado","", 1988, "Blanco",4);

        PiezaLego piez1 = new PiezaLego("Cuadrado", "Lego",10, "café");
        PiezaLego piez2 = new PiezaLego("Bola", "Lego", 5, "Rojo");

        System.out.println(fig2.toString());
        try {
            fig1.apilar(piez2);



        } catch (JuguetesException e) {
            System.out.println(e.getMessage());
        }


    }
}
