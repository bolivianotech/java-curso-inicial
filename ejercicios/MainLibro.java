import java.util.List;

public class MainLibro {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.agregarLibro(new Libro("Don Quijote", "Miguel de Cervantes", 1605));
        biblioteca.agregarLibro(new Libro("Cien años de soledad", "Gabriel García Márquez", 1967));
        biblioteca.agregarLibro(new Libro("El laberinto de la soledad", "Octavio Paz", 1950));
        biblioteca.agregarLibro(new Libro("Ficciones", "Jorge Luis Borges", 1944));
        biblioteca.agregarLibro(new Libro("El Aleph", "Jorge Luis Borges", 1949));

        System.out.println("Todos los libros:");
        biblioteca.listarLibros();

        System.out.println("\nLibros de Borges:");
        List<Libro> librosBorges = biblioteca.buscarPorAutor("Jorge Luis Borges");
        for (Libro libro : librosBorges) {
            System.out.println(libro);
        }

        System.out.println("\nEstadísticas:");
        biblioteca.mostrarEstadisticas();
    }
}