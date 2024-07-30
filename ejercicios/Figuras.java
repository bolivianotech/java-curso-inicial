abstract class Figurita {
    public abstract double calcularArea();
}

class Circulo extends Figurita {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}

class Rectangulo extends Figurita {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }
}

class Triangulo extends Figurita {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return 0.5 * base * altura;
    }
}

public class Figuras {
    public static void main(String[] args) {
        Figurita[] figuras = new Figurita[3];
        figuras[0] = new Circulo(5);
        figuras[1] = new Rectangulo(4, 6);
        figuras[2] = new Triangulo(3, 4);

        for (Figurita figura : figuras) {
            System.out.println("Área: " + figura.calcularArea());
        }
    }
}