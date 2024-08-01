import java.util.*;
import java.io.*;
import java.util.logging.*;

public class Inventario2 {
    private Map<String, Producto2> productos;
    private static final Logger logger = Logger.getLogger(Inventario2.class.getName());

    public Inventario2() {
        productos = new HashMap<>();
        configurarLogger();
    }

    private void configurarLogger() {
        try {
            FileHandler fileHandler = new FileHandler("inventario.log", true);
            SimpleFormatter formatter = new SimpleFormatter();
            fileHandler.setFormatter(formatter);
            logger.addHandler(fileHandler);
        } catch (IOException e) {
            logger.severe("No se pudo configurar el archivo de log: " + e.getMessage());
        }
    }

    public void agregarProducto(Producto2 producto) {
        productos.put(producto.getNombre(), producto);
    }

    public void realizarVenta(Map<String, Integer> productosAVender) 
            throws StockInsuficienteException2, ProductoNoEncontradoException2 {
        Map<String, Integer> ventaExitosa = new HashMap<>();
        double totalVenta = 0;

        try {
            for (Map.Entry<String, Integer> entry : productosAVender.entrySet()) {
                String nombreProducto = entry.getKey();
                int cantidadAVender = entry.getValue();

                if (!productos.containsKey(nombreProducto)) {
                    throw new ProductoNoEncontradoException2("Producto no encontrado: " + nombreProducto);
                }

                Producto2 producto = productos.get(nombreProducto);
                producto.vender(cantidadAVender);
                ventaExitosa.put(nombreProducto, cantidadAVender);
                totalVenta += producto.getPrecio() * cantidadAVender;
            }

            registrarVenta(ventaExitosa, totalVenta);
        } catch (StockInsuficienteException2 | ProductoNoEncontradoException2 e) {
            logger.warning("Error en la venta: " + e.getMessage());
            throw e;
        }
    }

    private void registrarVenta(Map<String, Integer> productosVendidos, double totalVenta) {
        try (FileWriter fw = new FileWriter("ventas.txt", true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {
            out.println("Nueva venta - Total: $" + totalVenta);
            for (Map.Entry<String, Integer> entry : productosVendidos.entrySet()) {
                out.println(entry.getKey() + ": " + entry.getValue());
            }
            out.println("--------------------");
        } catch (IOException e) {
            logger.severe("Error al registrar la venta: " + e.getMessage());
        }
    }
}