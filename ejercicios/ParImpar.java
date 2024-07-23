import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese un número
        System.out.print("Por favor, ingrese un número entero: ");
        int numero = scanner.nextInt();

        // Usar el operador módulo para verificar si el número es par o impar
        // Si el residuo de la división por 2 es 0, el número es par
        if (numero % 2 == 0) {
            System.out.println(numero + " es un número par.");
        } else {
            System.out.println(numero + " es un número impar.");
        }

        // Cerrar el scanner
        scanner.close();
    }
}

/*

Cómo funciona el operador módulo (%):
a % b devuelve el residuo cuando a se divide por b.
Para números pares, numero % 2 siempre será 0.
Para números impares, numero % 2 siempre será 1. 

*/