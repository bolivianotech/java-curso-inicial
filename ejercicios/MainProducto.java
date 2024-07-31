public class MainProducto {
    public static void main(String[] args) {
        Producto p1 = new Producto("Laptop", 1000, 40);
        Producto p2 = new Producto("Teléfono", 500, 50);

        try {
            p1.vender(3);
            p2.vender(12); // Esto lanzará una excepción
        } catch (StockInsuficienteException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            p1.vender(3); // Esto lanzará una excepción
        } catch (StockInsuficienteException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}