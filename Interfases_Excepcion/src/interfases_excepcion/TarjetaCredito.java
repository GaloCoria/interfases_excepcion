/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfases_excepcion;

/**
 *
 * @author PC
 */
class TarjetaCredito implements PagoConDescuento {
    
    private String numeroTarjeta;
    private String titular;
    private double porcentajeDescuento;
    
    public TarjetaCredito(String numeroTarjeta, String titular, double porcentajeDescuento) {
        this.numeroTarjeta = numeroTarjeta;
        this.titular = titular;
        this.porcentajeDescuento = porcentajeDescuento;
    }
    
    
    public boolean procesarPago(double monto) {
        System.out.println("\n💳 Procesando pago con Tarjeta de Crédito...");
        System.out.println("Titular: " + titular);
        System.out.println("Tarjeta: **** **** **** " + numeroTarjeta.substring(numeroTarjeta.length() - 4));
        System.out.println("Monto a cobrar: $" + String.format("%.2f", monto));
        System.out.println("✅ Pago procesado exitosamente");
        return true;
    }
    
    @Override
    public double aplicarDescuento(double monto) {
        double descuento = monto * (porcentajeDescuento / 100);
        double montoFinal = monto - descuento;
        System.out.println("Descuento aplicado (" + porcentajeDescuento + "%): -$" + String.format("%.2f", descuento));
        return montoFinal;
    }
    
    @Override
    public double obtenerPorcentajeDescuento() {
        return porcentajeDescuento;
    }
    
    
    public String obtenerTipoPago() {
        return "Tarjeta de Crédito";
    }
}
