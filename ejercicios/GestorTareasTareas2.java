import java.util.*;
import java.time.LocalDate;
import java.io.*;
import java.util.stream.Collectors;

public class GestorTareasTareas2 implements Serializable {
    private Map<String, PriorityQueue<TareaTareas2>> tareasPorCategoria = new HashMap<>();
    private TreeSet<TareaTareas2> recordatorios = new TreeSet<>(
        Comparator.comparing(TareaTareas2::getRecordatorio, Comparator.nullsLast(Comparator.naturalOrder()))
    );

    public void agregarTarea(TareaTareas2 tarea) {
        tareasPorCategoria.computeIfAbsent(tarea.getCategoria(), k -> new PriorityQueue<>()).offer(tarea);
        if (tarea.getRecordatorio() != null) {
            recordatorios.add(tarea);
        }
    }

    public TareaTareas2 obtenerTareaPrioritaria(String categoria) {
        PriorityQueue<TareaTareas2> tareas = tareasPorCategoria.get(categoria);
        return tareas != null ? tareas.peek() : null;
    }

    public void completarTareaPrioritaria(String categoria) {
        PriorityQueue<TareaTareas2> tareas = tareasPorCategoria.get(categoria);
        if (tareas != null && !tareas.isEmpty()) {
            TareaTareas2 tarea = tareas.poll();
            recordatorios.remove(tarea);
            System.out.println("Tarea completada: " + tarea);
        }
    }

    public void listarTareasPorCategoria() {
        for (Map.Entry<String, PriorityQueue<TareaTareas2>> entry : tareasPorCategoria.entrySet()) {
            System.out.println("Categoría: " + entry.getKey());
            for (TareaTareas2 tarea : entry.getValue()) {
                System.out.println("  " + tarea);
            }
        }
    }

    public List<TareaTareas2> obtenerTareasVencidas() {
        LocalDate hoy = LocalDate.now();
        return tareasPorCategoria.values().stream()
            .flatMap(Queue::stream)
            .filter(tarea -> tarea.getFechaLimite().isBefore(hoy))
            .collect(Collectors.toList());
    }

    public List<TareaTareas2> obtenerTareasOrdenadasPorFechaYPrioridad() {
        Comparator<TareaTareas2> comparador = Comparator
            .comparing(TareaTareas2::getFechaLimite)
            .thenComparing(TareaTareas2::getPrioridad, Comparator.reverseOrder());

        return tareasPorCategoria.values().stream()
            .flatMap(Queue::stream)
            .sorted(comparador)
            .collect(Collectors.toList());
    }

    public void guardarTareas(String archivo) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            oos.writeObject(this);
        }
    }

    public static GestorTareasTareas2 cargarTareas(String archivo) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            return (GestorTareasTareas2) ois.readObject();
        }
    }

    public void mostrarRecordatorios() {
        System.out.println("Recordatorios:");
        for (TareaTareas2 tarea : recordatorios) {
            System.out.println(tarea);
        }
    }
}