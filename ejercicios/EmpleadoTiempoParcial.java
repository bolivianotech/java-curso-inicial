public class EmpleadoTiempoParcial extends Empleado implements Evaluable {
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

    @Override
    public double evaluarDesempeño() {
        // Implementación simple: si trabaja más de 20 horas, se considera buen desempeño
        return horasTrabajadas > 20 ? 1.0 : 0.5;
    }
}