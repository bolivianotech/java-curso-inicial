import java.io.FileReader;
import java.io.IOException;

public class EjemploTryCatchFinallySim2 {
    public static void main(String[] args) {
        FileReader reader = null;
        try {
            // Intentamos abrir un archivo que no existe
            reader = new FileReader("archivo_inexistente.txt");
            // Operaciones con el archivo (no se ejecutarán porque el archivo no existe)
        } catch (IOException e) {
            System.out.println("Error al abrir el archivo: " + e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                    System.out.println("Archivo cerrado con éxito");
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar el archivo: " + e.getMessage());
            }
        }
    }
}