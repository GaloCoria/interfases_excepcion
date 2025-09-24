/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Sistema_Pagos;

/**
 *
 * @author PC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pagable tarjeta = new TarjetaCredito("1234-5678-9012-3456");
        Pagable transferencia = new Transferencia("AR123456789");
        Pagable efectivo = new Efectivo();

        // Usamos la misma función para todos los tipos
        ProcesadorPagos.procesarPago(tarjeta, 1500.0);
        ProcesadorPagos.procesarPago(transferencia, 2500.0);
        ProcesadorPagos.procesarPago(efectivo, 500.0);
    }
    
}
