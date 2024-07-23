import java.util.Scanner;

public class ConversionStringAInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese su edad como texto
        System.out.print("Por favor, ingrese su edad: ");
        String edadComoString = scanner.nextLine();

        try {
            // Convertir el String a int usando Integer.parseInt()
            int edad = Integer.parseInt(edadComoString);

            // Usar el valor convertido
            if (edad >= 18) {
                System.out.println("Eres mayor de edad.");
            } else {
                System.out.println("Eres menor de edad.");
            }

            // Realizar una operación matemática
            int añosHasta100 = 100 - edad;
            System.out.println("Te faltan " + añosHasta100 + " años para llegar a 100.");

        } catch (NumberFormatException e) {
            System.out.println("Error: Por favor, ingrese un número válido.");
        }

        scanner.close();
    }
}

/*

Se usa cuando recibes entrada del usuario como String (común en interfaces de usuario y formularios web).
Al leer datos de archivos de texto o bases de datos donde los números están almacenados como texto.
En parsing de argumentos de línea de comandos.

Debemos usarlo para transformar representaciones textuales de números en valores numéricos que pueden ser usados en cálculos y 
para validar que una entrada es realmente un número.

Manejo de errores:
Integer.parseInt() lanza una NumberFormatException si el String no puede ser convertido a int.
Es importante manejar esta excepción para evitar que el programa se detenga abruptamente. 

Este patrón es muy común en programación, especialmente en aplicaciones que interactúan con usuarios o procesan datos externos. 
La conversión de String a int permite validar entradas y realizar operaciones numéricas con datos que originalmente estaban en formato de texto.

*/