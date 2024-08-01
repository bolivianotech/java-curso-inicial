import java.util.List;

public class MainLibro2 {
    public static void main(String[] args) {
        Biblioteca2 biblioteca = new Biblioteca2();

        biblioteca.agregarLibro(new Libro2("Don Quijote", "Miguel de Cervantes", 1605, "Novela"));
        biblioteca.agregarLibro(new Libro2("Cien años de soledad", "Gabriel García Márquez", 1967, "Realismo mágico"));
        biblioteca.agregarLibro(new Libro2("El laberinto de la soledad", "Octavio Paz", 1950, "Ensayo"));
        biblioteca.agregarLibro(new Libro2("Ficciones", "Jorge Luis Borges", 1944, "Cuentos"));
        biblioteca.agregarLibro(new Libro2("El Aleph", "Jorge Luis Borges", 1949, "Cuentos"));

        System.out.println("Libros ordenados por año:");
        biblioteca.ordenarLibrosPorAnio();
        biblioteca.listarLibros();

        Libro2 libroAPrestar = biblioteca.buscarPorAutor("Jorge Luis Borges").get(0);
        biblioteca.prestarLibro(libroAPrestar, "Juan Pérez");
        biblioteca.prestarLibro(libroAPrestar, "María Gómez"); // Intentar prestar un libro ya prestado

        System.out.println("\nLibros prestados:");
        biblioteca.mostrarLibrosPrestados();

        biblioteca.devolverLibro(libroAPrestar);

        System.out.println("\nLibros en la categoría 'Cuentos':");
        List<Libro2> librosCuentos = biblioteca.obtenerLibrosPorCategoria("Cuentos");
        for (Libro2 libro : librosCuentos) {
            System.out.println(libro);
        }

        System.out.println("\nLibros más prestados:");
        List<Libro2> librosMasPrestados = biblioteca.obtenerLibrosMasPrestados(3);
        for (Libro2 libro : librosMasPrestados) {
            System.out.println(libro.getTitulo() + " - Prestado " + libro.getVecesPrestado() + " veces");
        }
    }
}