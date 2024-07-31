public class Producto {
    private String nombre;
    private double precio;
    private int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public void vender(int cantidadVendida) throws StockInsuficienteException {
        if (cantidadVendida > cantidad) {
            throw new StockInsuficienteException("Stock insuficiente para " + nombre);
        }
        cantidad -= cantidadVendida;
        System.out.println("Venta realizada: " + cantidadVendida + " " + nombre);
    }

    public String getNombre() {
        return nombre;
    }
}