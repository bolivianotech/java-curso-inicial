import java.util.ArrayList;
import java.util.Scanner;

public class OrdenarBuscarNombresM_Fix {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<String> nombres = new ArrayList<>();

    public static void main(String[] args) {
        ingresarNombres();
        mostrarMenu();
    }

    private static void ingresarNombres() {
        int cantidadNombres = leerEntero("¿Cuántos nombres desea ingresar? ");

        for (int i = 0; i < cantidadNombres; i++) {
            System.out.print("Ingrese el nombre " + (i + 1) + ": ");
            nombres.add(scanner.nextLine());
        }
    }

    private static void mostrarMenu() {
        while (true) {
            System.out.println("\nOpciones:");
            System.out.println("1. Ordenar y mostrar nombres");
            System.out.println("2. Buscar un nombre");
            System.out.println("3. Eliminar un nombre");
            System.out.println("4. Encontrar el nombre más largo");
            System.out.println("5. Salir");

            int opcion = leerEntero("Elija una opción: ");

            switch (opcion) {
                case 1: ordenarYMostrar(); break;
                case 2: buscarNombre(); break;
                case 3: eliminarNombre(); break;
                case 4: encontrarNombreMasLargo(); break;
                case 5:
                    System.out.println("Gracias por usar el programa.");
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        }
    }

    private static int leerEntero(String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un número válido.");
            }
        }
    }

    private static void ordenarYMostrar() {
        nombres.sort(String::compareTo);
        System.out.println("Nombres ordenados: " + nombres);
    }

    private static void buscarNombre() {
        System.out.print("Ingrese un nombre a buscar: ");
        String buscar = scanner.nextLine();
        int indice = nombres.indexOf(buscar);
        if (indice >= 0) {
            System.out.println(buscar + " está en la posición " + (indice + 1));
        } else {
            System.out.println(buscar + " no está en la lista");
        }
    }

    private static void eliminarNombre() {
        System.out.print("Ingrese el nombre a eliminar: ");
        String eliminar = scanner.nextLine();
        if (nombres.remove(eliminar)) {
            System.out.println(eliminar + " ha sido eliminado de la lista");
        } else {
            System.out.println(eliminar + " no se encontró en la lista");
        }
    }

    private static void encontrarNombreMasLargo() {
        if (nombres.isEmpty()) {
            System.out.println("La lista está vacía");
            return;
        }
        String nombreMasLargo = nombres.stream()
                .max((a, b) -> Integer.compare(a.length(), b.length()))
                .orElse("");
        System.out.println("El nombre más largo es: " + nombreMasLargo);
    }
}