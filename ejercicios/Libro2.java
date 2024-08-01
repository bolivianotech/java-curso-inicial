import java.util.Objects;

public class Libro2 implements Comparable<Libro2> {
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private String categoria;
    private int vecesPrestado;

    public Libro2(String titulo, String autor, int anioPublicacion, String categoria) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.categoria = categoria;
        this.vecesPrestado = 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void incrementarPrestamos() {
        vecesPrestado++;
    }

    public int getVecesPrestado() {
        return vecesPrestado;
    }

    @Override
    public int compareTo(Libro2 otro) {
        return Integer.compare(this.anioPublicacion, otro.anioPublicacion);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Libro2 libro = (Libro2) o;
        return Objects.equals(titulo, libro.titulo) && Objects.equals(autor, libro.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, autor);
    }

    @Override
    public String toString() {
        return "Libro2{" + "titulo='" + titulo + "', autor='" + autor + "', año=" + anioPublicacion + ", categoria='" + categoria + "'}";
    }
}