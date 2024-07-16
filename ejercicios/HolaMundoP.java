import java.util.Scanner;

public class HolaMundoP {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese su nombre
        System.out.print("Por favor, ingresa tu nombre: ");

        // Leer el nombre ingresado por el usuario
        String nombre = scanner.nextLine();

        // Imprimir el saludo personalizado
        System.out.println("¡Hola, " + nombre + "!");

        // Cerrar el scanner para liberar recursos
        scanner.close();
    }
}