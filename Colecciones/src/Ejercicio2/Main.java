/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author PC
 */
public class Main {
    public static void main(String[] args) {

     Biblioteca miBiblioteca = new Biblioteca("Biblioteca Central");
     
     Autor autor1 = new Autor("A001", "Gabriel García Márquez", "Colombiana");
     Autor autor2 = new Autor("A002", "J.K. Rowling", "Británica");
     Autor autor3 = new Autor("A003", "George R.R. Martin", "Estadounidense");
     
      miBiblioteca.agregarLibro("ISBN001", "Cien Años de Soledad", 1967, autor1);
      miBiblioteca.agregarLibro("ISBN002", "Harry Potter y la Piedra Filosofal", 1997, autor2);
      miBiblioteca.agregarLibro("ISBN003", "Harry Potter y la Cámara Secreta", 1998, autor2);
      miBiblioteca.agregarLibro("ISBN004", "Juego de Tronos", 1996, autor3);
      miBiblioteca.agregarLibro("ISBN005", "Choque de Reyes", 1998, autor3);
      
      miBiblioteca.listarLibros();
      System.out.println("\n=== BUSCAR LIBRO POR ISBN ===");
      Libro libroBuscado = miBiblioteca.buscarLibroPorIsbn("ISBN003");
      if (libroBuscado != null) {
            System.out.println("Libro encontrado: " + libroBuscado);
      } else {
            System.out.println("No se encontró el libro con ese ISBN.");
        }
      System.out.println("\n=== ELIMINAR LIBRO POR ISBN ===");
      miBiblioteca.eliminarLibro("ISBN002");
      miBiblioteca.listarLibros();
      System.out.println("\nCantidad total de libros en la biblioteca: " + miBiblioteca.obtenerCantidadLibros());
      miBiblioteca.mostrarAutoresDisponibles();   
     }
}
