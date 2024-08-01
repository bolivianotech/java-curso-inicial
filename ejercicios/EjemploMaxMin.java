import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Persona implements Comparable<Persona> {
    String nombre;
    int edad;

    Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return nombre + " (" + edad + " años)";
    }

    @Override
    public int compareTo(Persona otra) {
        return Integer.compare(this.edad, otra.edad);
    }
}

public class EjemploMaxMin {
    public static void main(String[] args) {
        // Ejemplo con números
        List<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(2);
        numeros.add(8);
        numeros.add(1);
        numeros.add(9);

        System.out.println("Lista de números: " + numeros);
        System.out.println("Número máximo: " + Collections.max(numeros));
        System.out.println("Número mínimo: " + Collections.min(numeros));

        // Ejemplo con objetos personalizados
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Ana", 25));
        personas.add(new Persona("Carlos", 30));
        personas.add(new Persona("Beatriz", 28));
        personas.add(new Persona("David", 22));

        System.out.println("\nLista de personas: " + personas);
        System.out.println("Persona de mayor edad: " + Collections.max(personas));
        System.out.println("Persona de menor edad: " + Collections.min(personas));
    }
}