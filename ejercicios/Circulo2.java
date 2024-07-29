public class Circulo2 extends Figura {
    private double radio;

    public Circulo2(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}