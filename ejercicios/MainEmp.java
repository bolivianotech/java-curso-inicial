import java.util.Arrays;
import java.util.Comparator;

public class MainEmp {
    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[3];
        empleados[0] = new EmpleadoTiempoCompleto("Juan", 1, 3000);
        empleados[1] = new EmpleadoTiempoParcial("María", 2, 15, 80);
        empleados[2] = new EmpleadoTiempoCompleto("Carlos", 3, 3500);

        System.out.println("Detalles de empleados:");
        for (Empleado emp : empleados) {
            emp.mostrarDetalles();
        }

        // Usar expresión lambda para ordenar empleados por salario
        Arrays.sort(empleados, (e1, e2) -> Double.compare(e2.calcularSalario(), e1.calcularSalario()));

        System.out.println("\nEmpleados ordenados por salario (mayor a menor):");
        for (Empleado emp : empleados) {
            emp.mostrarDetalles();
        }
    }
}