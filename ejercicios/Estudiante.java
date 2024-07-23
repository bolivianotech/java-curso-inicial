public class Estudiante {
    private String nombre;
    private int edad;
    private int grado;

    public Estudiante(String nombre, int edad, int grado) {
        this.nombre = nombre;
        this.edad = edad;
        this.grado = grado;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad + ", Grado: " + grado);
    }

    public void pasarDeGrado() {
        grado++;
        System.out.println(nombre + " ha pasado al grado " + grado);
    }

    public static void main(String[] args) {
        Estudiante est1 = new Estudiante("Ana", 15, 9);
        Estudiante est2 = new Estudiante("Juan", 16, 10);

        est1.mostrarInfo();
        est2.mostrarInfo();

        est1.pasarDeGrado();
        est2.pasarDeGrado();

        est1.mostrarInfo();
        est2.mostrarInfo();
    }
}