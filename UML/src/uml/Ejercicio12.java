/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uml;

/**
 *
 * @author PC
 */
public class Ejercicio12 {
      class Impuesto {
        private double monto;
        private Contribuyente contribuyente; 

        public Impuesto(double monto, Contribuyente contribuyente) {
            this.monto = monto;
            this.contribuyente = contribuyente;
        }

        public double getMonto() { return monto; }
    }

    class Contribuyente {
        private String nombre;
        private String cuil;

        public Contribuyente(String nombre, String cuil) {
            this.nombre = nombre;
            this.cuil = cuil;
        }
    }

    class Calculadora {
        public void calcular(Impuesto impuesto) {
            System.out.println("Calculando impuesto de: $" + impuesto.getMonto());
        }
    }
}
