/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

import colecciones.Ejercicio1.Producto;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author PC
 */
public class Biblioteca {
    private String nombre;
    private ArrayList<Libro> libros;
    
    public Biblioteca(String nombre) {
        this.libros = new ArrayList<>();
        this.nombre=nombre;
    }
    public boolean agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        
        if (buscarLibroPorIsbn(isbn) != null) {
            System.out.println("Error: Ya existe un libro con ISBN " + isbn);
            return false;
        }
        
        
        if (isbn == null || isbn.trim().isEmpty() || 
            titulo == null || titulo.trim().isEmpty() || 
            autor == null || anioPublicacion <= 0) {
            System.out.println("Error: Datos del libro inválidos");
            return false;
        }
        
        Libro nuevoLibro = new Libro(isbn.trim(), titulo.trim(), anioPublicacion, autor);
        libros.add(nuevoLibro);
        System.out.println("Libro agregado exitosamente: " + titulo);
        return true;
    }
    
    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("La biblioteca no tiene libros registrados.");
            return;
        }
        
        System.out.println("\n=== LISTADO DE LIBROS ===");
        System.out.println("Total de libros: " + libros.size());
        System.out.println("-".repeat(80));
        
        for (int i = 0; i < libros.size(); i++) {
            System.out.println((i + 1) + ". " + libros.get(i));
        }
        System.out.println("-".repeat(80));
    }
    public Libro buscarLibroPorIsbn(String isbn) {
        if (isbn == null || isbn.trim().isEmpty()) {
            return null;
        }
        
        String isbnBuscar = isbn.trim();
        for (Libro libro : libros) {
            if (libro.getIsbn().equals(isbnBuscar)) {
                return libro;
            }
        }
        return null;
    }
    
    public boolean eliminarLibro(String isbn) {
        Libro libroEncontrado = buscarLibroPorIsbn(isbn);
        
        if (libroEncontrado == null) {
            System.out.println("Error: No se encontró ningún libro con ISBN " + isbn);
            return false;
        }
        
        libros.remove(libroEncontrado);
        System.out.println("Libro eliminado exitosamente: " + libroEncontrado.getTitulo());
        return true;
    }
    public int obtenerCantidadLibros() {
        return libros.size();
    }
    public ArrayList<Libro> filtrarLibrosPorAnio(int anio) {
        ArrayList<Libro> librosFiltrados = new ArrayList<>();
        
        for (Libro libro : libros) {
            if (libro.getAnioPublicacion() == anio) {
                librosFiltrados.add(libro);
            }
        }
        
        System.out.println("\n=== LIBROS PUBLICADOS EN " + anio + " ===");
        if (librosFiltrados.isEmpty()) {
            System.out.println("No se encontraron libros publicados en " + anio);
        } else {
            System.out.println("Se encontraron " + librosFiltrados.size() + " libro(s):");
            System.out.println("-".repeat(60));
            for (int i = 0; i < librosFiltrados.size(); i++) {
                System.out.println((i + 1) + ". " + librosFiltrados.get(i));
            }
        }
        System.out.println("-".repeat(60));
        
        return librosFiltrados;
    }
     public void mostrarAutoresDisponibles() {
        if (libros.isEmpty()) {
            System.out.println("No hay autores disponibles. La biblioteca está vacía.");
            return;
        }

        Set<Autor> autoresUnicos = new HashSet<>();
        for (Libro libro : libros) {
            autoresUnicos.add(libro.getAutor());
        }

        ArrayList<Autor> autoresOrdenados = new ArrayList<>(autoresUnicos);
        autoresOrdenados.sort((a1, a2) -> {
            int cmpApellido = a1.getNombre().compareToIgnoreCase(a2.getNombre());
            return cmpApellido;
        });

        System.out.println("\n=== AUTORES DISPONIBLES ===");
        System.out.println("Total de autores únicos: " + autoresOrdenados.size());
        System.out.println("-".repeat(50));
        for (int i = 0; i < autoresOrdenados.size(); i++) {
            System.out.println((i + 1) + ". " + autoresOrdenados.get(i).getNombre());
        }
        System.out.println("-".repeat(50));
    }
 }

