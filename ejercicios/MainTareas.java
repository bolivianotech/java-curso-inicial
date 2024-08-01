import java.time.LocalDate;

public class MainTareas {
    public static void main(String[] args) {
        GestorTareasTareas gestor = new GestorTareasTareas();

        gestor.agregarTarea(new TareaTareas("Completar informe", 3, LocalDate.now().plusDays(1)));
        gestor.agregarTarea(new TareaTareas("Llamar al cliente", 1, LocalDate.now()));
        gestor.agregarTarea(new TareaTareas("Preparar presentación", 2, LocalDate.now().plusDays(2)));

        System.out.println("Tarea más prioritaria: " + gestor.obtenerTareaPrioritaria());

        gestor.listarTareasPendientes();

        gestor.completarTareaPrioritaria();
        gestor.completarTareaPrioritaria();

        System.out.println("Después de completar dos tareas:");
        gestor.listarTareasPendientes();

        gestor.deshacerUltimaTareaCompletada();

        System.out.println("Después de deshacer:");
        gestor.listarTareasPendientes();
    }
}