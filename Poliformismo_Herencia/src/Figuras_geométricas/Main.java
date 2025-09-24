/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Figuras_geométricas;

/**
 *
 * @author PC
 */
public class Main {
    public static void main(String[] args) {
        Figura[] figuras = new Figura[3];
         figuras[0] = new Circulo(2);     
        figuras[1] = new Rectangulo(4,6); 
        figuras[2] = new Circulo(2.5); 
        
          for (Figura f : figuras) {
            f.mostrarInfo();
        }
    }
    
}
