public class HexagonoE extends FiguraE implements Dibujable {
    private double lado;

    public HexagonoE(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return 3 * Math.sqrt(3) * lado * lado / 2;
    }

    @Override
    public double calcularPerimetro() {
        return 6 * lado;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un hexágono");
    }
}