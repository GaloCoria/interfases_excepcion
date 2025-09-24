/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema_Pagos;

/**
 *
 * @author PC
 */
public class ProcesadorPagos {
     public static <T extends Pagable> void procesarPago(T medio, double monto) {
        medio.pagar(monto);
    }
}
