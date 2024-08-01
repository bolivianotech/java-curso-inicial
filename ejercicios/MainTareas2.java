import java.time.LocalDate;
import java.io.IOException;

public class MainTareas2 {
    public static void main(String[] args) {
        GestorTareasTareas2 gestor = new GestorTareasTareas2();

        gestor.agregarTarea(new TareaTareas2("Completar informe", 3, LocalDate.now().plusDays(1), "Trabajo"));
        gestor.agregarTarea(new TareaTareas2("Llamar al cliente", 1, LocalDate.now(), "Trabajo"));
        gestor.agregarTarea(new TareaTareas2("Preparar presentación", 2, LocalDate.now().plusDays(2), "Trabajo"));
        gestor.agregarTarea(new TareaTareas2("Comprar víveres", 2, LocalDate.now().plusDays(3), "Personal"));

        // Establecer recordatorios
        TareaTareas2 tarea = new TareaTareas2("Pagar facturas", 1, LocalDate.now().plusDays(5), "Finanzas");
        tarea.setRecordatorio(LocalDate.now().plusDays(4));
        gestor.agregarTarea(tarea);

        System.out.println("Tareas por categoría:");
        gestor.listarTareasPorCategoria();

        System.out.println("\nTareas vencidas:");
        gestor.obtenerTareasVencidas().forEach(System.out::println);

        System.out.println("\nTareas ordenadas por fecha y prioridad:");
        gestor.obtenerTareasOrdenadasPorFechaYPrioridad().forEach(System.out::println);

        System.out.println("\nRecordatorios:");
        gestor.mostrarRecordatorios();

        // Guardar tareas
        try {
            gestor.guardarTareas("tareas2.ser");
            System.out.println("\nTareas guardadas exitosamente.");
        } catch (IOException e) {
            System.out.println("Error al guardar las tareas: " + e.getMessage());
        }

        // Cargar tareas
        try {
            GestorTareasTareas2 gestorCargado = GestorTareasTareas2.cargarTareas("tareas2.ser");
            System.out.println("\nTareas cargadas:");
            gestorCargado.listarTareasPorCategoria();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al cargar las tareas: " + e.getMessage());
        }
    }
}

/*
 En esta versión actualizada:

La clase TareaTareas se ha renombrado a TareaTareas2.
La clase GestorTareasTareas se ha renombrado a GestorTareasTareas2.
La clase MainTareas se ha renombrado a MainTareas2.

Todas las referencias internas a estas clases también se han actualizado para reflejar los nuevos nombres. Además, el archivo de serialización ahora se llama "tareas2.ser" para ser coherente con los nuevos nombres.
Para ejecutar este programa:

Guarda cada clase en su propio archivo con el nombre correspondiente (TareaTareas2.java, GestorTareasTareas2.java, y MainTareas2.java).
Compila los archivos: javac TareaTareas2.java GestorTareasTareas2.java MainTareas2.java
Ejecuta el programa principal: java MainTareas2
 */