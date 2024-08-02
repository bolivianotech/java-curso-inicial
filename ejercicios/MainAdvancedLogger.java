import java.time.LocalDate;
import java.util.List;

public class MainAdvancedLogger {
    public static void main(String[] args) {
        // Generar algunos logs
        AdvancedLogger.log(LogLevel.INFO, "Aplicación iniciada");
        AdvancedLogger.log(LogLevel.WARNING, "Espacio en disco bajo");
        AdvancedLogger.log(LogLevel.ERROR, "Conexión a la base de datos fallida");
        AdvancedLogger.log(LogLevel.DEBUG, "Depuración: valor de x = 5"); // Este no se guardará si el nivel mínimo es INFO

        // Buscar logs
        try {
            List<LogEntry> todayErrors = AdvancedLogger.searchLogs(LocalDate.now(), LogLevel.ERROR);
            System.out.println("Errores de hoy:");
            for (LogEntry entry : todayErrors) {
                System.out.println(entry);
            }
        } catch (Exception e) {
            System.err.println("Error al buscar logs: " + e.getMessage());
        }
    }
}