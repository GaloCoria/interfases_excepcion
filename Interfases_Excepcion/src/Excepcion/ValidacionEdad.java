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
class ValidacionEdad {
    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0) {
            throw new EdadInvalidaException("La edad no puede ser negativa: " + edad);
        }
        if (edad > 120) {
            throw new EdadInvalidaException("La edad no puede ser mayor a 120: " + edad);
        }
        System.out.println("✅ Edad válida: " + edad + " años");
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== VALIDACIÓN DE EDAD ===");
        System.out.print("Ingrese su edad: ");
        
        try {
            int edad = scanner.nextInt();
            validarEdad(edad);
            
            // Lógica adicional si la edad es válida
            if (edad >= 18) {
                System.out.println("✅ Es mayor de edad");
            } else {
                System.out.println("⚠️  Es menor de edad");
            }
            
            // Clasificación por grupos etarios
            if (edad < 13) {
                System.out.println("Categoría: Niño");
            } else if (edad < 18) {
                System.out.println("Categoría: Adolescente");
            } else if (edad < 60) {
                System.out.println("Categoría: Adulto");
            } else {
                System.out.println("Categoría: Adulto mayor");
            }
            
        } catch (EdadInvalidaException e) {
            System.out.println("❌ Error de validación: " + e.getMessage());
            
        } catch (Exception e) {
            System.out.println("❌ Error: Debe ingresar un número entero");
        } finally {
            scanner.close();
        }
    }
}
