/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema_Pagos;

/**
 *
 * @author PC
 */
public class Transferencia implements Pagable {
    private String cuentaDestino;

    public Transferencia(String cuentaDestino) {
        this.cuentaDestino = cuentaDestino;
    }

    @Override
    public void pagar(double monto) {
        System.out.println("Transferencia de $" + monto + " a la cuenta " + cuentaDestino);
    }
}
