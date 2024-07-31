import java.io.FileReader;
import java.io.IOException;

public class EjemploTryCatchFinally {
     public static void main(String[] args) {
        FileReader reader = null;
        try {
            reader = new FileReader("archivo.txt");
            // Operaciones con el archivo
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar el archivo");
            }
        }
    }
}
