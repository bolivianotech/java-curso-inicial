import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoggerConfig {
    private static final String CONFIG_FILE = "logger.properties";
    private static Properties properties = new Properties();

    static {
        try (FileInputStream fis = new FileInputStream(CONFIG_FILE)) {
            properties.load(fis);
        } catch (IOException e) {
            System.err.println("Error al cargar la configuración: " + e.getMessage());
        }
    }

    public static LogLevel getMinLogLevel() {
        String levelStr = properties.getProperty("log.level.min", "INFO");
        return LogLevel.valueOf(levelStr);
    }

    public static int getMaxFileSize() {
        return Integer.parseInt(properties.getProperty("log.file.maxsize", "1048576")); // 1MB por defecto
    }
}