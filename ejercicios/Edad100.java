import java.util.Scanner;
import java.time.Year;

public class Edad100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        
        int anioActual = Year.now().getValue();
        int anio100 = anioActual + (100 - edad);
        
        System.out.println(nombre + ", tendrás 100 años en el año " + anio100);
    }
}