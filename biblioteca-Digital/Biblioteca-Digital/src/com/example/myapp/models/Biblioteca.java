package com.example.myapp.models;

import com.example.myapp.interfaces.Prestamo;
import com.example.myapp.utils.BibliotecaException;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca implements Prestamo {

    private List<Usuario> listaUsuarios;
    private List<Libro> listaLibros;

    public Biblioteca() {
        this.listaUsuarios = new ArrayList<>();
        this.listaLibros = new ArrayList<>();
    }


    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public List<Libro> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(List<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }


    @Override
    public void registroUsuario(Usuario usuario) throws BibliotecaException {

        if (usuario.getNombre() == null) {
            throw new BibliotecaException("El campo usuario esta vacío!!");
        }
        for (Usuario usuario1 : listaUsuarios) {
            if (usuario1.getNombre().equalsIgnoreCase(usuario.getNombre())) {
                throw new BibliotecaException("El usuario ya ha sido registrado");
            }
        }
        listaUsuarios.add(usuario);
        System.out.println("Bienvenido usuario: " + usuario.getNumUsuario());

    }

    @Override
    public void prestarLibro(Usuario usuario, Libro libro) throws BibliotecaException {

        Libro libroEncontrado = null;

        for (Libro libroEstado : listaLibros) {
            if (libroEstado.getTitulo().equalsIgnoreCase(libro.getTitulo())) {
                libroEncontrado = libroEstado;
                break;
            }
        }

        if (libroEncontrado == null) {
            System.out.println("El libro no está registrado en la biblioteca.");
            return;
        }

        if (!libroEncontrado.isEstado()) {
            System.out.println("El libro " + libroEncontrado.getTitulo() + " no se encuentra disponible.");
            return;
        }

        if (usuario.getListaLibros().size() >= usuario.getTipoSuscripcion().getLibrosMax()) {
            throw new BibliotecaException("El usuario ha alcanzado el límite de libros permitidos para su suscripción.");
        }


        libroEncontrado.setEstado(false);
        usuario.getListaLibros().add(libroEncontrado);


        System.out.println("El libro " + libroEncontrado.getTitulo() + " ha sido prestado al usuario " + usuario.getNombre() + ".");
    }


    @Override
    public void devolverLibro(Usuario usuario, Libro libro) throws BibliotecaException {
        Libro libroPrestado = null;
        for (Libro l : usuario.getListaLibros()) {
            if (l.getTitulo().equalsIgnoreCase(libro.getTitulo())) {
                libroPrestado = l;
                break;
            }
        }

        if (libroPrestado == null) {
            throw new BibliotecaException("El usuario no tiene este libro en préstamo.");
        }

        for (Libro l : listaLibros) {
            if (l.getTitulo().equalsIgnoreCase(libroPrestado.getTitulo())) {
                l.setEstado(true);
                break;
            }
        }
        usuario.getListaLibros().remove(libroPrestado);

        System.out.println("El libro \"" + libroPrestado.getTitulo() + "\" ha sido devuelto con éxito por el usuario \"" + usuario.getNombre() + "\".");

    }

    @Override
    public void mostrarInfoPrestamos() {
        System.out.println("=== Información de Préstamos ===");
        mostrarUsuariosConPrestamos();
        mostrarLibrosDisponibles();
    }

    // Mostrar los préstamos de cada usuario
    private void mostrarUsuariosConPrestamos() {
        for (Usuario usuario : listaUsuarios) {
            System.out.println("Usuario: " + usuario.getNombre() + " | Suscripción: " + usuario.getTipoSuscripcion());
            if (usuario.getListaLibros().isEmpty()) {
                System.out.println("  No tiene libros prestados.");
            } else {
                System.out.println("  Libros prestados:");
                for (Libro libro : usuario.getListaLibros()) {
                    System.out.println("    - " + libro.getTitulo() + " por " + libro.getAutor());
                }
            }
        }
    }

    // Mostrar libros disponibles en la biblioteca
    private void mostrarLibrosDisponibles() {
        System.out.println("\n=== Libros Disponibles en la Biblioteca ===");
        for (Libro libro : listaLibros) {
            if (libro.isEstado()) {
                System.out.println("  - " + libro.getTitulo() + " por " + libro.getAutor());
            }
        }
    }
}
