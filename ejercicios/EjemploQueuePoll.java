import java.util.LinkedList;
import java.util.Queue;

public class EjemploQueuePoll {
    public static void main(String[] args) {
        Queue<String> cola = new LinkedList<>();

        // Añadir elementos a la cola
        cola.offer("Primero");
        cola.offer("Segundo");
        cola.offer("Tercero");

        System.out.println("Cola original: " + cola);

        // Usar poll() para obtener y eliminar elementos
        String elemento = cola.poll();
        System.out.println("Elemento obtenido: " + elemento);
        System.out.println("Cola después de poll(): " + cola);

        // Usar poll() en una cola vacía
        cola.poll();
        cola.poll();
        String elementoNulo = cola.poll();
        System.out.println("Elemento de cola vacía: " + elementoNulo);
        System.out.println("Cola después de vaciar: " + cola);
    }
}