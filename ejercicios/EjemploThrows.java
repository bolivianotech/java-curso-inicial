import java.io.FileNotFoundException;
import java.io.FileReader;

public class EjemploThrows {
    public static void main(String[] args) {
        try {
            leerArchivo("archivo.txt");
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no se encontró: " + e.getMessage());
        }
    }

    public static void leerArchivo(String nombreArchivo) throws FileNotFoundException {
        FileReader reader = new FileReader(nombreArchivo);
        // Operaciones con el archivo
    }
}