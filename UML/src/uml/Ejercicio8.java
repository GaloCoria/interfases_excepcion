/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uml;

/**
 *
 * @author PC
 */
public class Ejercicio8 {
    class Documento {
        private String titulo;
        private String contenido;
        private FirmaDigital firma; 

        public Documento(String titulo, String contenido, FirmaDigital firma) {
            this.titulo = titulo;
            this.contenido = contenido;
            this.firma = firma;
        }
    }

    class FirmaDigital {
        private String codigoHash;
        private String fecha;
        private Usuario usuario; 

        public FirmaDigital(String codigoHash, String fecha, Usuario usuario) {
            this.codigoHash = codigoHash;
            this.fecha = fecha;
            this.usuario = usuario;
        }
    }

    class Usuario {
        private String nombre;
        private String email;

        public Usuario(String nombre, String email) {
            this.nombre = nombre;
            this.email = email;
        }
    }
}
