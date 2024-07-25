import java.util.Random;

public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;
    private String titular;
    private String tipoDeMoneda;

    public CuentaBancaria(String titular, double saldoInicial, String tipoDeMoneda) {
        this.titular = titular;
        this.saldo = saldoInicial;
        this.tipoDeMoneda = tipoDeMoneda;
        this.numeroCuenta = generarNumeroCuenta();
    }

    private String generarNumeroCuenta() {
        Random rand = new Random();
        return "CTA-" + rand.nextInt(10000);
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

    public String getTipoDeMoneda() {
        return tipoDeMoneda;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito de " + monto + " " + tipoDeMoneda + " realizado. Nuevo saldo: " + saldo + " " + tipoDeMoneda);
        } else {
            System.out.println("El monto a depositar debe ser positivo");
        }
    }

    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("Retiro de " + monto + " " + tipoDeMoneda + " realizado. Nuevo saldo: " + saldo + " " + tipoDeMoneda);
        } else {
            System.out.println("Fondos insuficientes o monto inválido");
        }
    }

    public double convertirA(String monedaDestino, double tasaDeCambio) {
        double saldoConvertido = saldo * tasaDeCambio;
        System.out.println("Saldo de " + saldo + " " + tipoDeMoneda + " convertido a " + saldoConvertido + " " + monedaDestino);
        return saldoConvertido;
    }
}