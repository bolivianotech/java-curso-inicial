import java.io.File;

public class clasefile {
    public static void main (String[] args ) {
        File archivo = new File("ejemplo.txt");
        System.out.println("Exite? " + archivo.exists());
        System.out.println("Es Directorio? " + archivo.isDirectory());
        System.out.println("Tamaño: " + archivo.length() + " bytes");
    }
}
