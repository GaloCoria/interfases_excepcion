/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema_Pagos;

/**
 *
 * @author PC
 */
public class TarjetaCredito implements Pagable{
    private String numeroTarjeta;

    public TarjetaCredito(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public void pagar(double monto) {
        System.out.println("Pago de $" + monto + " realizado con Tarjeta de Crédito Nº " + numeroTarjeta);
    }
}
