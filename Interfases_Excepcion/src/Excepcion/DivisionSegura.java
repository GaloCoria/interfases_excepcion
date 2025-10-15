/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepcion;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class DivisionSegura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.println("=== DIVISIÓN SEGURA ===");
            System.out.print("Ingrese el dividendo: ");
            int dividendo = scanner.nextInt();
            
            System.out.print("Ingrese el divisor: ");
            int divisor = scanner.nextInt();
            
            int resultado = dividendo / divisor;
            System.out.println("Resultado: " + dividendo + " / " + divisor + " = " + resultado);
            System.out.println("Resto: " + (dividendo % divisor));
            
        } catch (ArithmeticException e) {
            System.out.println("❌ Error: No se puede dividir por cero");
        } catch (Exception e) {
            System.out.println("❌ Error: Entrada inválida. Debe ingresar números enteros");
        } finally {
            scanner.close();
        }
    }
}
