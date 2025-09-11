/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uml;

/**
 *
 * @author PC
 */
public class Ejercicio4 {
    class TarjetaDeCredito{
        private int numero;
        private int fechaVencimiento;
        private Cliente cliente;
        private Banco banco;
        
    public TarjetaDeCredito(int numero, int fechaVencimiento,Cliente cliente,Banco banco){
        this.numero=numero;
        this.fechaVencimiento=fechaVencimiento;
        this.cliente=cliente;
        this.banco=banco;
    }
    }
    class Cliente{
        private String nombre;
        private int dni;
        private TarjetaDeCredito tarjetaDeCredito;
    public Cliente(String nombre,int fechaVencimiento,TarjetaDeCredito tarjetaDeCredito){
        this.nombre=nombre;
        this.dni=dni;
        this.tarjetaDeCredito=tarjetaDeCredito;
    }
    }
    class Banco{
        private String nombre;
        private int cuit;
        
        
    public Banco(String nombre,int cuit){
        this.nombre=nombre;
        this.cuit=cuit;
    }
    }
}
