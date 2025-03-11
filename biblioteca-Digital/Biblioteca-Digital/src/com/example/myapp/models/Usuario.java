package com.example.myapp.models;

import com.example.myapp.enums.TipoSuscripcion;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    static int contadorUsuarios = 1;
    private String nombre;
    private int edad;
    private int numUsuario;
    private TipoSuscripcion tipoSuscripcion;
    private List<Libro> listaLibros;

    public Usuario(String nombre, int edad, TipoSuscripcion tipoSuscripcion) {
        this.nombre = nombre;
        this.edad = edad;
        this.numUsuario = contadorUsuarios++;
        this.tipoSuscripcion = tipoSuscripcion;
        this.listaLibros = new ArrayList<>();
    }

    public static int getContadorUsuarios() {
        return contadorUsuarios;
    }

    public static void setContadorUsuarios(int contadorUsuarios) {
        Usuario.contadorUsuarios = contadorUsuarios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumUsuario() {
        return numUsuario;
    }

    public void setNumUsuario(int numUsuario) {
        this.numUsuario = numUsuario;
    }

    public TipoSuscripcion getTipoSuscripcion() {
        return tipoSuscripcion;
    }

    public void setTipoSuscripcion(TipoSuscripcion tipoSuscripcion) {
        this.tipoSuscripcion = tipoSuscripcion;
    }

    public List<Libro> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(List<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", numUsuario=" + numUsuario +
                ", tipoSuscripcion=" + tipoSuscripcion +
                ", listaLibros=" + listaLibros +
                '}';
    }
}
