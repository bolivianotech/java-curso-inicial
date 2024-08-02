public class MainLogger {
    public static void main(String[] args) {
        Logger.log(LogLevel.INFO, "Aplicación iniciada");
        Logger.log(LogLevel.WARNING, "Espacio en disco bajo");
        Logger.log(LogLevel.ERROR, "Conexión a la base de datos fallida");

        System.out.println("Contenido del log:");
        Logger.showLogs();
    }
}