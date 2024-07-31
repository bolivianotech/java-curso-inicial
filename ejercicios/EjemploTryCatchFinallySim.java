import java.io.FileReader;
import java.io.IOException;

class SimuladorFileReader extends FileReader {
    private boolean simularErrorAlCerrar;

    public SimuladorFileReader(String fileName, boolean simularErrorAlCerrar) throws IOException {
        super(fileName);
        this.simularErrorAlCerrar = simularErrorAlCerrar;
    }

    @Override
    public void close() throws IOException {
        if (simularErrorAlCerrar) {
            throw new IOException("Error simulado al cerrar el archivo");
        }
        super.close();
    }
}

public class EjemploTryCatchFinallySim {
    public static void main(String[] args) {
        SimuladorFileReader reader = null;
        try {
            // Intentamos abrir un archivo que no existe
            reader = new SimuladorFileReader("archivo_inexistente.txt", true);
            // Operaciones con el archivo (no se ejecutarán porque el archivo no existe)
        } catch (IOException e) {
            System.out.println("Error al abrir el archivo: " + e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar el archivo: " + e.getMessage());
            }
        }
    }
}