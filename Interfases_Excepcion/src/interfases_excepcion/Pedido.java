/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfases_excepcion;

import java.util.ArrayList;
import java.util.List;


class Pedido implements Pagable {
    private ArrayList<Producto> productos;
    private EstadoPedido estado;
    private List<Notificable> observadores;
    
    public Pedido() {
        this.productos = new ArrayList<>();
        this.estado = EstadoPedido.PENDIENTE;
        this.observadores = new ArrayList<>();
    }
    
    public void registrarObservador(Notificable observador) {
        observadores.add(observador);
    }
    
    public void eliminarObservador(Notificable observador) {
        observadores.remove(observador);
    }
    
    private void notificarObservadores(String mensaje) {
        for (Notificable observador : observadores) {
            observador.notificar(mensaje);
        }
    }
    
    public void cambiarEstado(EstadoPedido nuevoEstado) {
        EstadoPedido estadoAnterior = this.estado;
        this.estado = nuevoEstado;
        String mensaje = "El pedido cambió de estado: " + estadoAnterior + " → " + nuevoEstado;
        notificarObservadores(mensaje);
    }
    
    public EstadoPedido getEstado() {
        return estado;
    }
    
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
    
    public void eliminarProducto(Producto producto) {
        productos.remove(producto);
    }
    
    public ArrayList<Producto> getProductos() {
        return productos;
    }
    
    
    public double calcularPrecio() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.calcularPrecio();
        }
        return total;
    }
    
    public boolean procesarPago(Pago metodoPago) {
        double monto = calcularPrecio();
        
        // Si el método de pago tiene descuento, aplicarlo
        if (metodoPago instanceof PagoConDescuento) {
            PagoConDescuento pagoDesc = (PagoConDescuento) metodoPago;
            monto = pagoDesc.aplicarDescuento(monto);
        }
        
        boolean exito = metodoPago.procesarPago(monto);
        
        if (exito) {
            cambiarEstado(EstadoPedido.PAGADO);
        }
        
        return exito;
    }
    
    public void mostrarDetalle() {
        System.out.println("\n=== DETALLE DEL PEDIDO ===");
        System.out.println("Estado: " + estado);
        for (Producto producto : productos) {
            System.out.println(producto);
        }
        System.out.println("Total: $" + calcularPrecio());
    }

    @Override
    public double calcularTotal() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
