import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedList {
    public static void main(String[] args) {
        // Crear ArrayList y LinkedList
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        // Añadir elementos
        long startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            arrayList.add("Elemento " + i);
        }
        long endTime = System.nanoTime();
        System.out.println("Tiempo para añadir en ArrayList: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            linkedList.add("Elemento " + i);
        }
        endTime = System.nanoTime();
        System.out.println("Tiempo para añadir en LinkedList: " + (endTime - startTime) + " ns");

        // Acceso aleatorio
        startTime = System.nanoTime();
        arrayList.get(50000);
        endTime = System.nanoTime();
        System.out.println("Tiempo de acceso aleatorio en ArrayList: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        linkedList.get(50000);
        endTime = System.nanoTime();
        System.out.println("Tiempo de acceso aleatorio en LinkedList: " + (endTime - startTime) + " ns");

        // Insertar al inicio
        startTime = System.nanoTime();
        arrayList.add(0, "Nuevo Elemento");
        endTime = System.nanoTime();
        System.out.println("Tiempo para insertar al inicio en ArrayList: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        linkedList.add(0, "Nuevo Elemento");
        endTime = System.nanoTime();
        System.out.println("Tiempo para insertar al inicio en LinkedList: " + (endTime - startTime) + " ns");

        // Eliminar del inicio
        startTime = System.nanoTime();
        arrayList.remove(0);
        endTime = System.nanoTime();
        System.out.println("Tiempo para eliminar del inicio en ArrayList: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        linkedList.remove(0);
        endTime = System.nanoTime();
        System.out.println("Tiempo para eliminar del inicio en LinkedList: " + (endTime - startTime) + " ns");
    }
}