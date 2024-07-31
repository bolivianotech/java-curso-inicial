import java.util.Arrays;
import java.util.Comparator;

public class MainEmp2 {
    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[4];
        empleados[0] = new EmpleadoTiempoCompleto("Juan", 1, 3000);
        empleados[1] = new EmpleadoTiempoParcial("María", 2, 15, 80);
        empleados[2] = new EmpleadoTiempoCompleto("Carlos", 3, 3500);
        empleados[3] = new EmpleadoPorContrato("Ana", 4, 20, 160);

        System.out.println("Detalles de empleados:");
        for (Empleado emp : empleados) {
            emp.mostrarDetalles();
            if (emp instanceof Evaluable) {
                System.out.println("Desempeño: " + ((Evaluable) emp).evaluarDesempeño());
                ((Evaluable) emp).aumentarSalario(5);
            }
            System.out.println();
        }

        // Ordenar empleados por nombre usando expresión lambda
        Arrays.sort(empleados, (e1, e2) -> e1.nombre.compareTo(e2.nombre));

        System.out.println("\nEmpleados ordenados por nombre:");
        for (Empleado emp : empleados) {
            System.out.println(emp.nombre);
        }
    }
}