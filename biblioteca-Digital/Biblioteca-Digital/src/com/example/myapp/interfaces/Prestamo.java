package com.example.myapp.interfaces;

import com.example.myapp.models.Libro;
import com.example.myapp.models.Usuario;
import com.example.myapp.utils.BibliotecaException;

public interface Prestamo {

    void registroUsuario(Usuario usuario) throws BibliotecaException;

    void prestarLibro(Usuario usuario, Libro Libro) throws BibliotecaException;

    void devolverLibro(Usuario usuario, Libro libro) throws BibliotecaException;

    void mostrarInfoPrestamos();
}
