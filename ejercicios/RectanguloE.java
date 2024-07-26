public class RectanguloE extends FiguraE implements Dibujable {
    private double base;
    private double altura;

    public RectanguloE(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un rectángulo");
    }
}