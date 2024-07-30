import java.util.Arrays;
import java.util.Scanner;

public class OrdenarBuscarNombres {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String[] nombres = new String[5];

            // Ingresar nombres
            for (int i = 0; i < 5; i++) {
                System.out.print("Ingrese el nombre " + (i+1) + ": ");
                nombres[i] = scanner.nextLine();
            }

            // Ordenar e imprimir
            Arrays.sort(nombres);
            System.out.println("Nombres ordenados: " + Arrays.toString(nombres));

            // Buscar nombre
            System.out.print("Ingrese un nombre a buscar: ");
            String buscar = scanner.nextLine();
            int indice = Arrays.binarySearch(nombres, buscar);
            
            if (indice >= 0) {
                System.out.println(buscar + " está en la posición " + (indice + 1));
            } else {
                System.out.println(buscar + " no está en la lista");
            }
        }
    }
}