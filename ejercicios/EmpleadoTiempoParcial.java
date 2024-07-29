public class EmpleadoTiempoParcial extends Empleado {
    private double tarifaPorHora;
    private int horasTrabajadas;

    public EmpleadoTiempoParcial(String nombre, int id, double tarifaPorHora, int horasTrabajadas) {
        super(nombre, id);
        this.tarifaPorHora = tarifaPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSalario() {
        return tarifaPorHora * horasTrabajadas;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Empleado Tiempo Parcial - Nombre: " + nombre + ", ID: " + id + ", Salario: " + calcularSalario());
    }
}