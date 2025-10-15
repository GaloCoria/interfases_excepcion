/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfases_excepcion;

/**
 *
 * @author PC
 */
interface PagoConDescuento extends Pago{
     double aplicarDescuento(double monto);
    double obtenerPorcentajeDescuento();
}
