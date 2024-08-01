import java.util.ArrayDeque;
import java.util.Deque;

public class EjemploArrayDeque {
    public static void main(String[] args) {
        // Crear un ArrayDeque
        Deque<String> deque = new ArrayDeque<>();

        // Añadir elementos al final (como una cola)
        deque.offer("Primero");
        deque.offer("Segundo");
        deque.offer("Tercero");

        System.out.println("Deque inicial: " + deque);

        // Añadir elementos al principio
        deque.offerFirst("Nuevo Primero");
        System.out.println("Después de offerFirst: " + deque);

        // Añadir elementos al final
        deque.offerLast("Nuevo Último");
        System.out.println("Después de offerLast: " + deque);

        // Obtener el primer elemento sin eliminarlo
        String primero = deque.peekFirst();
        System.out.println("Primer elemento (sin eliminar): " + primero);

        // Obtener y eliminar el primer elemento
        String eliminadoPrimero = deque.pollFirst();
        System.out.println("Elemento eliminado del principio: " + eliminadoPrimero);
        System.out.println("Deque después de pollFirst: " + deque);

        // Obtener y eliminar el último elemento
        String eliminadoUltimo = deque.pollLast();
        System.out.println("Elemento eliminado del final: " + eliminadoUltimo);
        System.out.println("Deque después de pollLast: " + deque);

        // Usar como pila (LIFO - Last In First Out)
        deque.push("Elemento de Pila");
        System.out.println("Después de push: " + deque);

        String elementoPila = deque.pop();
        System.out.println("Elemento extraído (pop): " + elementoPila);
        System.out.println("Deque después de pop: " + deque);

        // Iterar sobre los elementos
        System.out.println("Iterando sobre los elementos:");
        for (String elemento : deque) {
            System.out.println(elemento);
        }
    }
}