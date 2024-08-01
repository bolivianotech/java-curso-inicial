import java.util.*;

public class MainProducto2 {
    public static void main(String[] args) {
        Inventario2 inventario = new Inventario2();

        inventario.agregarProducto(new Producto2("Laptop", 1000, 5));
        inventario.agregarProducto(new Producto2("Teléfono", 500, 10));
        inventario.agregarProducto(new Producto2("Tablet", 300, 8));

        Map<String, Integer> venta1 = new HashMap<>();
        venta1.put("Laptop", 2);
        venta1.put("Teléfono", 3);

        try {
            inventario.realizarVenta(venta1);
            System.out.println("Venta 1 realizada con éxito");
        } catch (StockInsuficienteException2 | ProductoNoEncontradoException2 e) {
            System.out.println("Error en Venta 1: " + e.getMessage());
        }

        Map<String, Integer> venta2 = new HashMap<>();
        venta2.put("Laptop", 4); // Esto debería causar una excepción de stock insuficiente
        venta2.put("Monitor", 2); // Esto debería causar una excepción de producto no encontrado

        try {
            inventario.realizarVenta(venta2);
            System.out.println("Venta 2 realizada con éxito");
        } catch (StockInsuficienteException2 | ProductoNoEncontradoException2 e) {
            System.out.println("Error en Venta 2: " + e.getMessage());
        }
    }
}