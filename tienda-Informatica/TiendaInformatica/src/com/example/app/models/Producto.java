package com.example.app.models;


import com.example.app.enums.TipoGamaProducto;
import com.example.app.interfaces.Descuento;

public abstract class Producto implements Descuento {

    static int contadorProductos = 1;
    private int idProducto;
    private String nombre;
    private double precio;
    private int cantidadProducto;
    private TipoGamaProducto tipoGamaProducto;

    public Producto(String nombre, double precio, int cantidadProducto, TipoGamaProducto tipoGamaProducto) {
        this.idProducto = contadorProductos++;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadProducto = cantidadProducto;
        this.tipoGamaProducto = tipoGamaProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public TipoGamaProducto getTipoGamaProducto() {
        return tipoGamaProducto;
    }

    public void setTipoGamaProducto(TipoGamaProducto tipoGamaProducto) {
        this.tipoGamaProducto = tipoGamaProducto;
    }

    @Override
    public void calcularDescuento() {

     //   double descuentoProducto = p.getPrecio() * p.getTipoGamaProducto().getPrecioGama() / 100;
     //   setPrecio(p.getPrecio() - descuentoProducto);

        double descuentoProducto = this.getPrecio() * this.getTipoGamaProducto().getPrecioGama() / 100;
        this.setPrecio(this.getPrecio() - descuentoProducto);
        System.out.println("Descuento aplicado: " + descuentoProducto + "€");
        System.out.println("Precio final con descuento: " + this.getPrecio() + "€");

    }

    // Aumentar stock
    public void incrementarStock(int cantidad) {
        if (cantidad > 0) {
            this.cantidadProducto += cantidad;
            System.out.println("Stock actualizado: " + this.cantidadProducto);
        } else {
            System.out.println("Cantidad inválida para aumentar stock.");
        }
    }

    // Disminuir stock (simula una compra)
    public boolean disminuirStock(int cantidad) {
        if (cantidad > 0 && this.cantidadProducto >= cantidad) {
            this.cantidadProducto -= cantidad;
            System.out.println("Stock reducido. Quedan " + this.cantidadProducto + " unidades.");
            return true;
        } else {
            System.out.println("No hay suficiente stock disponible.");
            return false;
        }
    }



    @Override
    public String toString() {
        return String.format("Producto -→ %s | Precio: %.2f | Stock: %d ", nombre, precio, cantidadProducto);
    }
}
