/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uml;

/**
 *
 * @author PC
 */
public class Ejercicio2 {
     class Celular {
    private int Imei;
    private String Marca;
    private String Modelo;            
    private Bateria bateria;
    private Usuario usuario;

    public Celular(int Imei, String Marca,  String Modelo, Bateria bateria,Usuario usuario) {
        this.Imei = Imei;
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.bateria = bateria;
        this.usuario=usuario;
    }

    
}

class Bateria {
    private String modelo;
    private int capacidad;

    public Bateria(String modelo, int capacidad) {
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

   
}

class Usuario {
    private String nombre;
    private String dni;
    private Celular celular;

    public Usuario(String nombre, String dni, Celular celular) {
        this.nombre = nombre;
        this.dni = dni;
        this.celular=celular;
    }

    
}
}
