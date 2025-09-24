/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecciones.Ejercicio1;
import java.util.ArrayList;
/**
 *
 * @author PC
 */
public class Inventario {
    private ArrayList<Producto> productos; 
    
     public Inventario() {
        this.productos = new ArrayList<>();
    }
      public void agregarProducto(Producto p) {
        productos.add(p);
    }
     public void listarProductos(){
         for (Producto p : productos) {
            p.mostrarInfo();
        }
     }
     public  Producto buscarProductoPorld(String id){
         for (Producto p : productos) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
     }
     public void eliminarProducto(String id) {
        productos.removeIf(p -> p.getId().equals(id));
    }
     
    public void actualizarStock(String id, int nuevaCantidad) {
        Producto p = buscarProductoPorld(id);
        if (p != null) {
            p.setCantidad(nuevaCantidad);
        }
    }

    public ArrayList<Producto> filtrarPorCategoria(CategoriaProducto categoria) {
        ArrayList<Producto> filtrados = new ArrayList<>();
        for (Producto p : productos) {
            if (p.getCategoria() == categoria) {
                filtrados.add(p);
            }
        }
        return filtrados;
    }

    public int obtenerTotalStock() {
        int total = 0;
        for (Producto p : productos) {
            total += p.getCantidad();
        }
        return total;
    }

    public Producto obtenerProductoConMayorStock() {
        if (productos.isEmpty()) return null;
        Producto mayor = productos.get(0);
        for (Producto p : productos) {
            if (p.getCantidad() > mayor.getCantidad()) {
                mayor = p;
            }
        }
        return mayor;
    }

    public ArrayList<Producto> filtrarProductosPorPrecio(double min, double max) {
        ArrayList<Producto> filtrados = new ArrayList<>();
        for (Producto p : productos) {
            if (p.getPrecio() >= min && p.getPrecio() <= max) {
                filtrados.add(p);
            }
        }
        return filtrados;
    }

    public void mostrarCategoriasDisponibles() {
        for (CategoriaProducto c : CategoriaProducto.values()) {
            System.out.println(c + " - " + c.getDescripcion());
        }
    }
}
