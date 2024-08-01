import java.util.*;

public class Biblioteca {
    private List<Libro> libros = new ArrayList<>();
    private Set<String> autores = new HashSet<>();
    private Map<String, Integer> conteoLibrosPorAutor = new HashMap<>();

    public void agregarLibro(Libro libro) {
        libros.add(libro);
        autores.add(libro.getAutor());
        conteoLibrosPorAutor.put(libro.getAutor(), conteoLibrosPorAutor.getOrDefault(libro.getAutor(), 0) + 1);
    }

    public List<Libro> buscarPorAutor(String autor) {
        List<Libro> resultado = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                resultado.add(libro);
            }
        }
        return resultado;
    }

    public void listarLibros() {
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }

    public void mostrarEstadisticas() {
        System.out.println("Autores únicos: " + autores);
        System.out.println("Conteo de libros por autor: " + conteoLibrosPorAutor);
    }
}