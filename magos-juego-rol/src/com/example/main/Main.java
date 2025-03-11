package com.example.main;

import com.example.enums.TipoRaza;
import com.example.models.Clerigo;
import com.example.models.Mago;
import com.example.utils.JuegoException;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        try {
            // CREANDO MAGOS
            Mago mago1 = new Mago("Mago Oscuro", TipoRaza.ELFO, 15, 20, 100, 100);
            Mago mago2 = new Mago("Gandalf ", TipoRaza.HUMANO, 15, 20, 100, 100);

            //CREADO CLÉRIGO
            Clerigo clerigo1 = new Clerigo("Pardos",TipoRaza.HUMANO,18,15,50,50,"Neptuno");

            //APRENDIENDO HECHIZOS
            mago1.aprendeHechizo("Bola de Fuego");
            mago1.aprendeHechizo("Terremoto");
            mago2.aprendeHechizo("Luz del alba");

            //ATAQUE ENTRE MAGOS

            mago1.lanzaHechizo(mago2,"Bola de fuego");
            mago1.lanzaHechizo(mago2,"Terremoto");

            //CLERIGO CURA MAGO
            clerigo1.curar(mago2);

            // IMPRIMIENDO PERSONAJES
            System.out.println(clerigo1);
            System.out.println(mago1);
            System.out.println(mago2);

        } catch (JuegoException e) {
            System.out.println(e.getMessage());
            ;
        }
    }
}
