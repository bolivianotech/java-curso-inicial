import java.io.*;
import java.nio.file.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class AdvancedLogger {
    private static final String LOG_DIRECTORY = "logs";
    private static final DateTimeFormatter FILE_DATE_FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    private static final DateTimeFormatter ENTRY_DATE_FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static void log(LogLevel level, String message) {
        if (level.ordinal() < LoggerConfig.getMinLogLevel().ordinal()) {
            return;
        }

        LogEntry entry = new LogEntry(LocalDateTime.now(), level, message);
        String logFileName = getLogFileName();

        try {
            Files.createDirectories(Paths.get(LOG_DIRECTORY));
            Path logFile = Paths.get(LOG_DIRECTORY, logFileName);

            if (Files.exists(logFile) && Files.size(logFile) > LoggerConfig.getMaxFileSize()) {
                rotateLog(logFile);
            }

            Files.write(logFile, (entry.toString() + System.lineSeparator()).getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.err.println("Error al escribir en el log: " + e.getMessage());
        }
    }

    private static String getLogFileName() {
        return "log_" + LocalDate.now().format(FILE_DATE_FORMAT) + ".log";
    }

    private static void rotateLog(Path logFile) throws IOException {
        String fileName = logFile.getFileName().toString();
        String baseName = fileName.substring(0, fileName.lastIndexOf('.'));
        String extension = fileName.substring(fileName.lastIndexOf('.'));
        
        Path rotatedFile = logFile.resolveSibling(baseName + "_" + System.currentTimeMillis() + extension);
        Files.move(logFile, rotatedFile);
        compressLog(rotatedFile);
    }

    private static void compressLog(Path logFile) throws IOException {
        Path zipFile = logFile.resolveSibling(logFile.getFileName().toString() + ".zip");
        try (ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(zipFile.toFile()));
             FileInputStream fis = new FileInputStream(logFile.toFile())) {
            ZipEntry zipEntry = new ZipEntry(logFile.getFileName().toString());
            zos.putNextEntry(zipEntry);
            byte[] bytes = new byte[1024];
            int length;
            while ((length = fis.read(bytes)) >= 0) {
                zos.write(bytes, 0, length);
            }
        }
        Files.delete(logFile);
    }

    public static List<LogEntry> searchLogs(LocalDate date, LogLevel level) throws IOException {
        List<LogEntry> results = new ArrayList<>();
        Path logFile = Paths.get(LOG_DIRECTORY, "log_" + date.format(FILE_DATE_FORMAT) + ".log");
        
        if (Files.exists(logFile)) {
            List<String> lines = Files.readAllLines(logFile);
            for (String line : lines) {
                LogEntry entry = parseLogEntry(line);
                if (entry != null && (level == null || entry.getLevel() == level)) {
                    results.add(entry);
                }
            }
        }
        return results;
    }

    private static LogEntry parseLogEntry(String line) {
        try {
            int timestampEnd = line.indexOf(']');
            LocalDateTime timestamp = LocalDateTime.parse(line.substring(1, timestampEnd), ENTRY_DATE_FORMAT);
            int levelEnd = line.indexOf(':', timestampEnd);
            LogLevel level = LogLevel.valueOf(line.substring(timestampEnd + 2, levelEnd).trim());
            String message = line.substring(levelEnd + 1).trim();
            return new LogEntry(timestamp, level, message);
        } catch (Exception e) {
            return null;
        }
    }
}