/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepcion;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class ConversionCadenaNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== CONVERSIÓN DE CADENA A NÚMERO ===");
        System.out.print("Ingrese un número: ");
        String texto = scanner.nextLine();
        
        try {
            int numero = Integer.parseInt(texto);
            System.out.println("✅ Conversión exitosa: " + numero);
            System.out.println("El doble del número es: " + (numero * 2));
            System.out.println("El triple del número es: " + (numero * 3));
            
        } catch (NumberFormatException e) {
            System.out.println("❌ Error: '" + texto + "' no es un número válido");
            System.out.println("Detalles técnicos: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
