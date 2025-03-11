package com.example.app.main;


import com.example.app.enums.TipoGamaProducto;
import com.example.app.models.Laptop;
import com.example.app.models.Movil;
import com.example.app.models.Producto;

public class Main {

    public static void main(String[] args) {



        Movil movil1 = new Movil("Samsung Galaxy S21", 999.99, 20, TipoGamaProducto.Gama_Alta,"Android", 6);
        Movil movil2 = new Movil("iPhone 13", 1099.99, 15, TipoGamaProducto.Gama_Baja,"iOS", 6);
        Movil movil3 = new Movil("Google Pixel 16", 899.99, 10, TipoGamaProducto.Gama_Alta,"Android", 6);
        Movil movil4 = new Movil("OnePlus 9", 799.99, 12, TipoGamaProducto.Gama_Alta,"Android", 6);


        Laptop laptop1 = new Laptop("Dell XPS 13", 1199.99, 8,TipoGamaProducto.Gama_Alta, 255, "Intel");
        Laptop laptop2 = new Laptop("MacBook Air", 999.99, 5, TipoGamaProducto.Gama_Baja,128, "A8");


        System.out.println(movil1);
        movil1.calcularDescuento();

        // Lista de productos
        Producto[] productos = {movil1, movil2, movil3, movil4, laptop1, laptop2};

// Mostrar inventario antes de la compra
        imprimirInventario(productos);

// Simular una compra
        comprarProducto(movil1, 5);

// Mostrar inventario después de la compra
        imprimirInventario(productos);



    }

    public static void imprimirInventario(Producto[] productos) {
        System.out.println("\n📦 Inventario de la tienda:");
        for (Producto p : productos) {
            System.out.println(p);
        }
    }

    public static void comprarProducto(Producto p, int cantidad) {
        System.out.println("\n🛒 Comprando " + cantidad + " unidades de " + p.getNombre() + "...");
        boolean compraExitosa = p.disminuirStock(cantidad);
        if (compraExitosa) {
            System.out.println("Compra realizada con éxito.");
        } else {
            System.out.println("No se pudo completar la compra.");
        }
    }





}
