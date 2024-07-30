public class Rectangulo2 extends Figura2 {
    private double base;
    private double altura;

    public Rectangulo2(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }
}