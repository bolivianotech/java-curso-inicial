import java.util.Scanner;

public class Edad100m {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int edadActual;

        // Validación para asegurarse de que la edad ingresada sea un número positivo
        do {
            System.out.print("Por favor, ingrese su edad actual: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Eso no es un número válido. Intente de nuevo.");
                System.out.print("Por favor, ingrese su edad actual: ");
                scanner.next();
            }
            edadActual = scanner.nextInt();
            if (edadActual <= 0) {
                System.out.println("La edad debe ser un número positivo. Intente de nuevo.");
            }
        } while (edadActual <= 0);

        int edadEn100Anos = edadActual + 100;
        int anosFaltantes = 100 - edadActual;

        System.out.println("En 100 años tendrás " + edadEn100Anos + " años.");
        System.out.println("Te faltan " + anosFaltantes + " años para tener 100 años.");

        scanner.close();
    }
}