public class EmpleadoTiempoCompleto extends Empleado implements Bonificable, Evaluable {
    private double salarioMensual;

    public EmpleadoTiempoCompleto(String nombre, int id, double salarioMensual) {
        super(nombre, id);
        this.salarioMensual = salarioMensual;
    }

    @Override
    public double calcularSalario() {
        return salarioMensual + calcularBono();
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Empleado Tiempo Completo - Nombre: " + nombre + ", ID: " + id + ", Salario: " + calcularSalario());
    }

    @Override
    public double calcularBono() {
        return salarioMensual * 0.1; // 10% de bono
    }

    @Override
    public double evaluarDesempeño() {
        // Implementación simple: siempre se considera buen desempeño
        return 1.0;
    }

}