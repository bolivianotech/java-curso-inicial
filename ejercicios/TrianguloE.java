public class TrianguloE extends FiguraE implements Dibujable {
    private double base;
    private double altura;

    public TrianguloE(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return 0.5 * base * altura;
    }

    @Override
    public double calcularPerimetro() {
        // Asumiendo que es un triángulo rectángulo
        double hipotenusa = Math.sqrt(base*base + altura*altura);
        return base + altura + hipotenusa;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un triángulo");
    }
}