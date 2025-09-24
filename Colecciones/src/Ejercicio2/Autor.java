/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author PC
 */
public class Autor {
    private String id;
    private String nombre;
    private String nacionalidad;
    
    public Autor(String id,String nombre,String nacionalidad){
        this.id=id;
        this.nombre=nombre;
        this.nacionalidad=nacionalidad;
    }
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getNacionalidad() { return nacionalidad; }
    public void setNacionalidad(String nacionalidad) { this.nacionalidad = nacionalidad; }

     public void mostrarInfo() {
        System.out.println("ID: " + id +
                           ", Nombre: " + nombre +
                           ", Nacionalidad: " + nacionalidad );
    }
}
