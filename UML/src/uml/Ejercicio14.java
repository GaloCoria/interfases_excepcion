/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uml;

/**
 *
 * @author PC
 */
public class Ejercicio14 {
    class Render {
        private String formato;
        private Proyecto proyecto; // asociación unidireccional

        public Render(String formato, Proyecto proyecto) {
            this.formato = formato;
            this.proyecto = proyecto;
        }
    }

    class Proyecto {
        private String nombre;
        private int duracionMin;

        public Proyecto(String nombre, int duracionMin) {
            this.nombre = nombre;
            this.duracionMin = duracionMin;
        }
    }

    class EditorVideo {
        public void exportar(String formato, Proyecto proyecto) {
            Render render = new Render(formato, proyecto); // dependencia de creación
            System.out.println("Render exportado en formato: " + formato);
        }
    }
}
