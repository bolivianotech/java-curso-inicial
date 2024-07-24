import java.util.ArrayList;
import java.util.List;

public class EstudianteA {
    private String nombre;
    private int edad;
    private int grado;
    private List<Double> calificaciones;

    public EstudianteA(String nombre, int edad, int grado) {
        this.nombre = nombre;
        this.edad = edad;
        this.grado = grado;
        this.calificaciones = new ArrayList<>();
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad + ", Grado: " + grado);
        System.out.println("Calificaciones: " + calificaciones);
        System.out.println("Promedio: " + calcularPromedio());
        System.out.println("Estado: " + (aprueba() ? "Aprobado" : "Reprobado"));
    }

    public void pasarDeGrado() {
        grado++;
        System.out.println(nombre + " ha pasado al grado " + grado);
    }

    public void agregarCalificacion(double calificacion) {
        calificaciones.add(calificacion);
    }

    public double calcularPromedio() {
        if (calificaciones.isEmpty()) {
            return 0.0;
        }
        double suma = 0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / calificaciones.size();
    }

    public boolean aprueba() {
        return calcularPromedio() >= 6.0;
    }

    public String getNombre() {
        return nombre;
    }
}