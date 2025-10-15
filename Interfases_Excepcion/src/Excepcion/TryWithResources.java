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
public class TryWithResources {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== TRY-WITH-RESOURCES ===");
        System.out.print("Ingrese el nombre del archivo (ej: datos.txt): ");
        String nombreArchivo = scanner.nextLine();
        
        // Try-with-resources: el BufferedReader se cierra automáticamente
        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            
            String linea;
            int numeroLinea = 1;
            int totalCaracteres = 0;
            
            System.out.println("\n--- Contenido del archivo ---");
            while ((linea = reader.readLine()) != null) {
                System.out.println(numeroLinea + ": " + linea);
                totalCaracteres += linea.length();
                numeroLinea++;
            }
            System.out.println("--- Fin del archivo ---");
            System.out.println("\n📊 Estadísticas:");
            System.out.println("   Total de líneas: " + (numeroLinea - 1));
            System.out.println("   Total de caracteres: " + totalCaracteres);
            System.out.println("✅ Archivo cerrado automáticamente por try-with-resources");
            
        } catch (FileNotFoundException e) {
            System.out.println("❌ Error: El archivo '" + nombreArchivo + "' no existe");
            System.out.println("Sugerencia: Cree el archivo o verifique la ruta");
            
        } catch (IOException e) {
            System.out.println("❌ Error de entrada/salida: " + e.getMessage());
        }
        
        scanner.close();
        // No es necesario cerrar el reader manualmente, 
        // try-with-resources lo hace automáticamente
    }
}
