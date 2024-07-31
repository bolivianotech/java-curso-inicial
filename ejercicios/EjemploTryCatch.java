public class EjemploTryCatch {
    public static void main(String[] args) {
        try {
            int resultado = 10 / 0; // Esto causará una ArithmeticException
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero");
        }
        System.out.println("El programa continúa");
    }
}
