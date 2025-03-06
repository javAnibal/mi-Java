package com.example.main;

import com.example.enums.TipoRaza;
import com.example.models.Mago;
import com.example.utils.JuegoException;

public class Main {
    public static void main(String[] args) {
        try {
            Mago mago1 = new Mago("Mago Oscuro", TipoRaza.ELFO,15, 20,100,100);
            System.out.println(mago1);
        } catch (JuegoException e) {
            System.out.println(e.getMessage());;
        }
    }
}
