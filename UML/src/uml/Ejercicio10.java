/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uml;

/**
 *
 * @author PC
 */
public class Ejercicio10 {
    class CuentaBancaria {
        private String cbu;
        private double saldo;
        private ClaveSeguridad clave; 
        private Titular titular; 

        public CuentaBancaria(String cbu, double saldo, ClaveSeguridad clave, Titular titular) {
            this.cbu = cbu;
            this.saldo = saldo;
            this.clave = clave;
            this.titular = titular;
        }
    }

    class ClaveSeguridad {
        private String codigo;
        private String ultimaModificacion;

        public ClaveSeguridad(String codigo, String ultimaModificacion) {
            this.codigo = codigo;
            this.ultimaModificacion = ultimaModificacion;
        }
    }

    class Titular {
        private String nombre;
        private String dni;
        private CuentaBancaria cuenta; 

        public Titular(String nombre, String dni) {
            this.nombre = nombre;
            this.dni = dni;
        }
    }
}
