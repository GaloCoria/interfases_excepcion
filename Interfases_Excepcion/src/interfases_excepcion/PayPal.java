/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfases_excepcion;

/**
 *
 * @author PC
 */
class PayPal implements Pago {
    private String email;
    
    public PayPal(String email) {
        this.email = email;
    }
    
    
    public boolean procesarPago(double monto) {
        System.out.println("\n?️ Procesando pago con PayPal...");
        System.out.println("Cuenta: " + email);
        System.out.println("Monto a cobrar: $" + String.format("%.2f", monto));
        System.out.println(" Pago procesado exitosamente");
        return true;
    }
    
    
    public String obtenerTipoPago() {
        return "PayPal";
    }
}
