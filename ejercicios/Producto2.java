public class Producto2 {
    private String nombre;
    private double precio;
    private int cantidad;

    public Producto2(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public void vender(int cantidadVendida) throws StockInsuficienteException2 {
        if (cantidadVendida > cantidad) {
            throw new StockInsuficienteException2("Stock insuficiente para " + nombre);
        }
        cantidad -= cantidadVendida;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }
}
