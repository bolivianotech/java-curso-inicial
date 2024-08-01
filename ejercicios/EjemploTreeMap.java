import java.util.TreeMap;
import java.util.Map;

public class EjemploTreeMap {
    public static void main(String[] args) {
        // Crear un TreeMap de estudiantes (ID, Nombre)
        TreeMap<Integer, String> estudiantes = new TreeMap<>();

        // Agregar elementos al TreeMap
        estudiantes.put(103, "Carlos");
        estudiantes.put(101, "Ana");
        estudiantes.put(105, "Eduardo");
        estudiantes.put(102, "Beatriz");
        estudiantes.put(104, "Diana");

        // Imprimir el TreeMap (notarás que está ordenado por clave)
        System.out.println("Estudiantes ordenados por ID:");
        for (Map.Entry<Integer, String> entry : estudiantes.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Nombre: " + entry.getValue());
        }

        // Obtener y mostrar el primer y último elemento
        System.out.println("\nPrimer estudiante: " + estudiantes.firstEntry());
        System.out.println("Último estudiante: " + estudiantes.lastEntry());

        // Obtener todos los estudiantes con ID menor o igual a 103
        System.out.println("\nEstudiantes con ID <= 103:");
        Map<Integer, String> subMap = estudiantes.headMap(104);
        for (Map.Entry<Integer, String> entry : subMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Nombre: " + entry.getValue());
        }

        // Buscar un estudiante específico
        int idBuscado = 102;
        if (estudiantes.containsKey(idBuscado)) {
            System.out.println("\nEstudiante con ID " + idBuscado + ": " + estudiantes.get(idBuscado));
        } else {
            System.out.println("\nNo se encontró estudiante con ID " + idBuscado);
        }

        // Eliminar un estudiante
        int idEliminar = 103;
        estudiantes.remove(idEliminar);
        System.out.println("\nDespués de eliminar el estudiante con ID " + idEliminar + ":");
        for (Map.Entry<Integer, String> entry : estudiantes.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Nombre: " + entry.getValue());
        }

        // Obtener y mostrar el estudiante con el ID inmediatamente inferior a 104
        Map.Entry<Integer, String> lowerEntry = estudiantes.lowerEntry(104);
        System.out.println("\nEstudiante con ID inmediatamente inferior a 104: " + lowerEntry);

        // Obtener y mostrar el estudiante con el ID inmediatamente superior a 102
        Map.Entry<Integer, String> higherEntry = estudiantes.higherEntry(102);
        System.out.println("Estudiante con ID inmediatamente superior a 102: " + higherEntry);
    }
}