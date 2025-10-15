/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepcion;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class LecturaArchivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== LECTURA DE ARCHIVO ===");
        System.out.print("Ingrese el nombre del archivo (ej: datos.txt): ");
        String nombreArchivo = scanner.nextLine();
        
        BufferedReader reader = null;
        
        try {
            reader = new BufferedReader(new FileReader(nombreArchivo));
            String linea;
            int numeroLinea = 1;
            
            System.out.println("\n--- Contenido del archivo ---");
            while ((linea = reader.readLine()) != null) {
                System.out.println(numeroLinea + ": " + linea);
                numeroLinea++;
            }
            System.out.println("--- Fin del archivo ---");
            System.out.println("✅ Total de líneas leídas: " + (numeroLinea - 1));
            
        } catch (FileNotFoundException e) {
            System.out.println("❌ Error: El archivo '" + nombreArchivo + "' no existe");
            System.out.println("Asegúrese de que el archivo esté en el directorio del proyecto");
            
        } catch (IOException e) {
            System.out.println("❌ Error al leer el archivo: " + e.getMessage());
            
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                    System.out.println("Archivo cerrado correctamente");
                }
            } catch (IOException e) {
                System.out.println("❌ Error al cerrar el archivo: " + e.getMessage());
            }
            scanner.close();
        }
    }
}
