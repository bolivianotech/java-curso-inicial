import java.util.HashSet;
import java.util.Set;

public class EjemploSet {
    public static void main(String[] args) {
        // Crear un Set de Strings
        Set<String> colores = new HashSet<>();

        // Añadir elementos al Set
        System.out.println("Añadiendo 'Rojo': " + colores.add("Rojo"));
        System.out.println("Añadiendo 'Verde': " + colores.add("Verde"));
        System.out.println("Añadiendo 'Azul': " + colores.add("Azul"));

        // Intentar añadir un elemento que ya existe
        System.out.println("Intentando añadir 'Rojo' de nuevo: " + colores.add("Rojo"));

        // Mostrar el contenido del Set
        System.out.println("\nContenido del Set:");
        for (String color : colores) {
            System.out.println(color);
        }

        // Verificar el tamaño del Set
        System.out.println("\nTamaño del Set: " + colores.size());

        // Verificar si un elemento existe
        System.out.println("\n¿El Set contiene 'Rojo'? " + colores.contains("Rojo"));
        System.out.println("¿El Set contiene 'Amarillo'? " + colores.contains("Amarillo"));
    }
}