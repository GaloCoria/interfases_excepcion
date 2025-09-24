/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colecciones.Ejercicio1;

/**
 *
 * @author PC
 */
public class Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Inventario inv = new Inventario();
        Producto p1 = new Producto("P001", "Notebook", 2500, 5, CategoriaProducto.ELECTRONICA);
        Producto p2 = new Producto("P002", "Remera", 1500, 10, CategoriaProducto.ROPA);
        Producto p3 = new Producto("P003", "Arroz", 1200, 20, CategoriaProducto.ALIMENTOS);
        inv.agregarProducto(p1);
        inv.agregarProducto(p2);
        inv.agregarProducto(p3);
        System.out.println("📦 Inventario completo:");
        inv.listarProductos();
        System.out.println("\n🔎 Buscando P002:");
        Producto encontrado = inv.buscarProductoPorld("P002");
        if (encontrado != null) encontrado.mostrarInfo();
         inv.actualizarStock("P001", 8);
        System.out.println("\n📈 Stock actualizado de P001:");
        inv.buscarProductoPorld("P001").mostrarInfo();
        inv.eliminarProducto("P003");
        System.out.println("\n🗑️ Después de eliminar P003:");
        inv.listarProductos();
        System.out.println("\n👕 Productos de ROPA:");
        for (Producto p : inv.filtrarPorCategoria(CategoriaProducto.ROPA)) {
            p.mostrarInfo();
        }
        System.out.println("\n📊 Total de stock: " + inv.obtenerTotalStock());
        System.out.println("\n🏆 Producto con mayor stock:");
        inv.obtenerProductoConMayorStock().mostrarInfo();

        
        System.out.println("\n💲 Productos entre $1000 y $2000:");
        for (Producto p : inv.filtrarProductosPorPrecio(1000, 2000)) {
            p.mostrarInfo();
        }

        
        System.out.println("\n📂 Categorías disponibles:");
        inv.mostrarCategoriasDisponibles();
    }
    
}
