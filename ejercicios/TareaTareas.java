import java.time.LocalDate;

public class TareaTareas implements Comparable<TareaTareas> {
    private String descripcion;
    private int prioridad;
    private LocalDate fechaLimite;

    public TareaTareas(String descripcion, int prioridad, LocalDate fechaLimite) {
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.fechaLimite = fechaLimite;
    }

    @Override
    public int compareTo(TareaTareas otra) {
        return Integer.compare(otra.prioridad, this.prioridad); // Mayor prioridad primero
    }

    @Override
    public String toString() {
        return "TareaTareas{" + "descripcion='" + descripcion + "', prioridad=" + prioridad +
               ", fechaLimite=" + fechaLimite + '}';
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
}