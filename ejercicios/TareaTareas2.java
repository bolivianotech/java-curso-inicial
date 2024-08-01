import java.io.Serializable;
import java.time.LocalDate;

public class TareaTareas2 implements Comparable<TareaTareas2>, Serializable {
    private String descripcion;
    private int prioridad;
    private LocalDate fechaLimite;
    private String categoria;
    private LocalDate recordatorio;

    public TareaTareas2(String descripcion, int prioridad, LocalDate fechaLimite, String categoria) {
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.fechaLimite = fechaLimite;
        this.categoria = categoria;
    }

    @Override
    public int compareTo(TareaTareas2 otra) {
        return Integer.compare(otra.prioridad, this.prioridad); // Mayor prioridad primero
    }

    @Override
    public String toString() {
        return "TareaTareas2{" + "descripcion='" + descripcion + "', prioridad=" + prioridad +
               ", fechaLimite=" + fechaLimite + ", categoria='" + categoria + "', recordatorio=" + recordatorio + '}';
    }

    // Getters y setters
    public String getDescripcion() {
        return descripcion;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public LocalDate getFechaLimite() {
        return fechaLimite;
    }

    public String getCategoria() {
        return categoria;
    }

    public LocalDate getRecordatorio() {
        return recordatorio;
    }

    public void setRecordatorio(LocalDate recordatorio) {
        this.recordatorio = recordatorio;
    }
}