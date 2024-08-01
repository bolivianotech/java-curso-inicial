import java.util.*;

public class GestorTareasTareas {
    private PriorityQueue<TareaTareas> tareasPendientes = new PriorityQueue<>();
    private Deque<TareaTareas> tareasCompletadas = new ArrayDeque<>();

    public void agregarTarea(TareaTareas tarea) {
        tareasPendientes.offer(tarea);
    }

    public TareaTareas obtenerTareaPrioritaria() {
        return tareasPendientes.peek();
    }

    public void completarTareaPrioritaria() {
        TareaTareas tarea = tareasPendientes.poll();
        if (tarea != null) {
            tareasCompletadas.push(tarea);
            System.out.println("Tarea completada: " + tarea);
        }
    }

    public void deshacerUltimaTareaCompletada() {
        TareaTareas tarea = tareasCompletadas.poll();
        if (tarea != null) {
            tareasPendientes.offer(tarea);
            System.out.println("Tarea devuelta a pendientes: " + tarea);
        }
    }

    public void listarTareasPendientes() {
        System.out.println("Tareas pendientes:");
        for (TareaTareas tarea : tareasPendientes) {
            System.out.println(tarea);
        }
    }
}
