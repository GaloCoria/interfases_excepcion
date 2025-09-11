/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uml;

/**
 *
 * @author PC
 */
public class Ejercicio3 {
    class Libro {
        private String Titulo;
        private int Isbn;
        private Autor autor;
        private Editorial editorial;
        
     public Libro(String Titulo, int Isbn, Autor autor, Editorial editorial) {
     this.Titulo=Titulo;
     this.Isbn=Isbn;
     this.autor=autor;
     this.editorial=editorial;
    }
        
    }
    
    
   class Autor{
       private String Nombre;
        private String Nacionalidad;
    public Autor(String Nombre, String Nacionalidad){
      this.Nombre=Nombre;
      this.Nacionalidad=Nacionalidad;
    }
    }
   
   class Editorial{
       private String nombre;
       private String direccion;
      public Editorial(String nombre, String direccion){
          this.nombre=nombre;
          this.direccion=direccion;
      }
   }
   
}

