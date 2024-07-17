import java.util.Scanner;

public class TablasMutiplicar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String respuesta;

        do {
            // 1. Pedir al usuario un número
            System.out.print("Ingrese un número para ver su tabla de multiplicar: ");
            int numero = scanner.nextInt();

            // 2. Imprimir la tabla de multiplicar del 1 al 10
            System.out.println("Tabla de multiplicar del " + numero + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }

            // 3. Preguntar al usuario si quiere ver otra tabla
            System.out.print("¿Quiere ver otra tabla? (S/N): ");
            respuesta = scanner.next();

        } while (respuesta.equalsIgnoreCase("S")); // 4. Repetir si el usuario responde 'S'

        System.out.println("¡Gracias por usar el programa!");
        scanner.close();
    }
}