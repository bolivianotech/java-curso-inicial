public class Triangulo2 extends Figura {
    private double base;
    private double altura;

    public Triangulo2(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return 0.5 * base * altura;
    }
}