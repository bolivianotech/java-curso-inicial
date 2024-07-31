public class EjemploMultipleCatch {
    public static void main(String[] args) {
        try {
            int[] numeros = {1, 2, 3};
            System.out.println(numeros[10]); // Causará ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Índice fuera de rango");
        } catch (Exception e) {
            System.out.println("Error general: " + e.getMessage());
        }
    }
}