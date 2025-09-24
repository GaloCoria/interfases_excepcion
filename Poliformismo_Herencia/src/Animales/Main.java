/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Animales;

import java.util.ArrayList;
import java.util.List;
public class Main {

    
    public static void main(String[] args) {
         List<Animal> animales = new ArrayList<>();

        animales.add(new Perro("Zimba"));
        animales.add(new Gato("Chispitas"));
        animales.add(new Vaca("Manchitas"));

        
        for (Animal a : animales) {
            a.describirAnimal();
            a.hacerSonido();
            System.out.println("----------------------");
        }
    
    }
    
}
