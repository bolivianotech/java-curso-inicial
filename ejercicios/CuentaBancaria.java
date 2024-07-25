import java.util.Random;

public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;
    private String titular;

    {
        // Inicializador de instancia
        Random rand = new Random();
        this.numeroCuenta = "CTA-" + rand.nextInt(10000);
    }

    public CuentaBancaria(String titular) {
        this(titular, 0);
    }

    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito de " + monto + " realizado. Nuevo saldo: " + saldo);
        } else {
            System.out.println("El monto a depositar debe ser positivo");
        }
    }

    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("Retiro de " + monto + " realizado. Nuevo saldo: " + saldo);
        } else {
            System.out.println("Fondos insuficientes o monto inválido");
        }
    }

    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("Juan Pérez", 1000);
        System.out.println("Cuenta creada: " + cuenta1.getNumeroCuenta());
        cuenta1.depositar(500);
        cuenta1.retirar(200);

        CuentaBancaria cuenta2 = new CuentaBancaria("María López");
        System.out.println("Cuenta creada: " + cuenta2.getNumeroCuenta());
        cuenta2.depositar(100);
        cuenta2.retirar(50);
    }
}