/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Empleados;

import java.util.ArrayList;
import java.util.List;
public class Main{

    
     public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();

        empleados.add(new EmpleadoPlanta("Juan Pérez", 50000, 10000));
        empleados.add(new EmpleadoTemporal("Ana Gómez", 800, 60));
        empleados.add(new EmpleadoPlanta("Carlos Ruiz", 60000, 15000));
        empleados.add(new EmpleadoTemporal("Laura Díaz", 700, 80));

        
        for (Empleado e : empleados) {
            e.mostrarInfo();

           
            if (e instanceof EmpleadoPlanta) {
                System.out.println(" -> Es un empleado de planta.");
            } else if (e instanceof EmpleadoTemporal) {
                System.out.println(" -> Es un empleado temporal.");
            }
            System.out.println("-----------------------------");
        }
    }
    
}
