/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfases_excepcion;

/**
 *
 * @author PC
 */
public class Main {

    public static void main(String[] args) {
        // Crear cliente
        Cliente cliente = new Cliente("Juan Pérez", "juan.perez@email.com");
        
        // Crear productos
        Producto p1 = new Producto("Laptop", 1200.00);
        Producto p2 = new Producto("Mouse", 25.50);
        Producto p3 = new Producto("Teclado", 85.00);
        
        // Crear pedido y registrar cliente como observador
        Pedido pedido = new Pedido();
        pedido.registrarObservador(cliente);
        
        // Agregar productos
        pedido.agregarProducto(p1);
        pedido.agregarProducto(p2);
        pedido.agregarProducto(p3);
        
        // Mostrar detalle del pedido
        pedido.mostrarDetalle();
        
        System.out.println("\n" + "=".repeat(40));
        System.out.println("EJEMPLO 1: Pago con Tarjeta de Crédito (con descuento)");
        System.out.println("=".repeat(40));
        
        // Cambiar estado a procesando
        pedido.cambiarEstado(EstadoPedido.PROCESANDO);
        
        // Procesar pago con tarjeta de crédito (10% descuento)
        TarjetaCredito tarjeta = new TarjetaCredito("4532123456789012", "Juan Pérez", 10.0);
        pedido.procesarPago(tarjeta);
        
        // Cambiar más estados
        pedido.cambiarEstado(EstadoPedido.ENVIADO);
        pedido.cambiarEstado(EstadoPedido.ENTREGADO);
        
        System.out.println("\n" + "=".repeat(40));
        System.out.println("EJEMPLO 2: Pago con PayPal (sin descuento)");
        System.out.println("=".repeat(40));
        
        // Crear otro pedido
        Pedido pedido2 = new Pedido();
        pedido2.registrarObservador(cliente);
        pedido2.agregarProducto(new Producto("Monitor", 350.00));
        pedido2.agregarProducto(new Producto("Webcam", 75.00));
        
        pedido2.mostrarDetalle();
        
        pedido2.cambiarEstado(EstadoPedido.PROCESANDO);
        
        // Procesar pago con PayPal
        PayPal paypal = new PayPal("juan.perez@email.com");
        pedido2.procesarPago(paypal);
        
        pedido2.cambiarEstado(EstadoPedido.ENVIADO);
    
}
}
