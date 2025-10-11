package latinasincloud.model;


import latinasincloud.exception.LibroNoEncontradoException;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

// Clase Biblioteca: Lista de libros (List<Libro>). Métodos:
//agregarLibro(Libro libro), buscarLibro(String titulo): Lanza
//LibroNoEncontradoException si no existe

// Clase de Gestión: Contiene la lista de libros y la lógica de búsqueda.

public class Biblioteca {
    // La lista usa polimorfismo (puede contener Libro y LibroDigital)
    private List<Libro> listaLibros = new ArrayList<>();

    //  generar constructor de BibliotecA

    public Biblioteca() {

    }

    public Biblioteca(List<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }


    // generar los getters and setters listaLibros
    public List<Libro> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(List<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    // agregar método agregarLibro(Libro libro) para Libro y LibroDigital

    public void agregarLibro(Libro libro) {
        this.listaLibros.add(libro);
        System.out.println("El libro ha sido agregado: " + libro.getTitulo());


    }

    // agregar método buscarLibro(String titulo): Lanza LibroNoEncontradoException si no existe

    // Busca un libro por título y lanza una excepción si no lo encuentra.

    public Libro buscarLibro(String titulo)

            throws LibroNoEncontradoException {
        for (Libro libro : listaLibros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        // Si el bucle termina, el libro no existe
        throw new LibroNoEncontradoException("El libro de titulo " + titulo + " no ha sido encontrado en la biblioteca.");
    }

    // Método opcional para ver todos los libros
    public void mostrarTodosLosLibros() {
        System.out.println("\n--- Libros en la Biblioteca (" + listaLibros.size() + ") ---");
        for (Libro libro : listaLibros) {
            libro.mostrarInfo();
        }
    }
    //EXTRAS: Eliminar libro

    public void borrarLibro(String titulo)
            throws LibroNoEncontradoException {

        boolean borrado = false;

        for (int i = 0; i < listaLibros.size(); i++) {
            if (listaLibros.get(i).getTitulo().equalsIgnoreCase(titulo)) {
                listaLibros.remove(i);
                borrado = true;
                break;
            }
        }
        if (!borrado) {
            throw new LibroNoEncontradoException("No se encuentra registrado el libro con el título: " + titulo);
        }
        else{
            System.out.println("El siguiente libro ha sido eliminado: " + titulo);
            System.out.println("Libros disponibles:");
            mostrarTodosLosLibros();
        }
    }


}






