public class Main {
    public static void main(String[] args) {
        Figura[] figuras = new Figura[3];
        figuras[0] = new Circulo2(5);
        figuras[1] = new Rectangulo2(4, 6);
        figuras[2] = new Triangulo2(3, 4);

        for (Figura figura : figuras) {
            System.out.println("Área: " + figura.calcularArea());
        }
    }
}