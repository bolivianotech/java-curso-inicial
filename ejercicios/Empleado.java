public abstract class Empleado {
    protected String nombre;
    protected int id;

    public Empleado(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    public abstract double calcularSalario();
    public abstract void mostrarDetalles();
}