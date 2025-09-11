    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uml;

/**
 *
 * @author PC
 */
public class EJercicio5 {
     class Computadora {
        private String marca;
        private String numeroSerie;
        private PlacaMadre placaMadre; 
        private Propietario propietario; 

        public Computadora(String marca, String numeroSerie, PlacaMadre placaMadre, Propietario propietario) {
            this.marca = marca;
            this.numeroSerie = numeroSerie;
            this.placaMadre = placaMadre;
            this.propietario = propietario;
        }
    }

    class PlacaMadre {
        private String modelo;
        private String chipset;

        public PlacaMadre(String modelo, String chipset) {
            this.modelo = modelo;
            this.chipset = chipset;
        }
    }

    class Propietario {
        private String nombre;
        private String dni;
        private Computadora computadora; 

        public Propietario(String nombre, String dni) {
            this.nombre = nombre;
            this.dni = dni;
        }
    }
}
