/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figuras_geométricas;

/**
 *
 * @author PC
 */
public abstract class Figura {
    private String nombre;
    
    public Figura(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    
    public abstract double calcularArea();

    public void mostrarInfo() {
        System.out.println("Figura: " + nombre + ", Área: " + calcularArea());
    }
}
