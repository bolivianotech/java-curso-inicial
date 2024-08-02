import java.util.*;

public class Biblioteca2 {
    private List<Libro2> libros = new ArrayList<>();
    private Set<String> autores = new HashSet<>();
    private Map<String, Integer> conteoLibrosPorAutor = new HashMap<>();
    private Map<Libro2, String> librosPrestados = new HashMap<>();
    private Map<String, List<Libro2>> librosPorCategoria = new HashMap<>();

    public void agregarLibro(Libro2 libro) {
        libros.add(libro);
        autores.add(libro.getAutor());
        conteoLibrosPorAutor.put(libro.getAutor(), conteoLibrosPorAutor.getOrDefault(libro.getAutor(), 0) + 1);
        librosPorCategoria.computeIfAbsent(libro.getCategoria(), k -> new ArrayList<>()).add(libro);
    }

    public void ordenarLibrosPorAnio() {
        Collections.sort(libros);
    }

    public void prestarLibro(Libro2 libro, String lector) {
        if (!librosPrestados.containsKey(libro)) {
            librosPrestados.put(libro, lector);
            libro.incrementarPrestamos();
        } else {
            System.out.println("El libro ya está prestado.");
        }
    }

    public void devolverLibro(Libro2 libro) {
        if (librosPrestados.remove(libro) != null) {
            System.out.println("Libro devuelto con éxito.");
        } else {
            System.out.println("Este libro no estaba prestado.");
        }
    }

    public List<Libro2> obtenerLibrosPorCategoria(String categoria) {
        return librosPorCategoria.getOrDefault(categoria, new ArrayList<>());
    }

    public List<Libro2> obtenerLibrosMasPrestados(int n) {
        PriorityQueue<Libro2> pq = new PriorityQueue<>((l1, l2) -> Integer.compare(l2.getVecesPrestado(), l1.getVecesPrestado()));
        pq.addAll(libros);
        List<Libro2> masPrestados = new ArrayList<>();
        for (int i = 0; i < n && !pq.isEmpty(); i++) {
            masPrestados.add(pq.poll());
        }
        return masPrestados;
    }

    public List<Libro2> buscarPorAutor(String autor) {
        List<Libro2> resultado = new ArrayList<>();
        for (Libro2 libro : libros) {
            if (libro.getAutor().equals(autor)) {
                resultado.add(libro);
            }
        }
        return resultado;
    }

    public void listarLibros() {
        for (Libro2 libro : libros) {
            System.out.println(libro);
        }
    }

    public void mostrarEstadisticas() {
        System.out.println("Autores únicos: " + autores);
        System.out.println("Conteo de libros por autor: " + conteoLibrosPorAutor);
    }

    public void mostrarLibrosPrestados() {
        //System.out.println("Libros prestados:");
        for (Map.Entry<Libro2, String> entry : librosPrestados.entrySet()) {
            System.out.println(entry.getKey().getTitulo() + " - Prestado a: " + entry.getValue());
        }
    }
}