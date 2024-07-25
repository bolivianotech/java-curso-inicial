import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<CuentaBancaria> cuentas;

    public Banco() {
        this.cuentas = new ArrayList<>();
    }

    public void agregarCuenta(CuentaBancaria cuenta) {
        cuentas.add(cuenta);
        System.out.println("Cuenta agregada: " + cuenta.getNumeroCuenta());
    }

    public CuentaBancaria buscarCuenta(String numeroCuenta) {
        for (CuentaBancaria cuenta : cuentas) {
            if (cuenta.getNumeroCuenta().equals(numeroCuenta)) {
                return cuenta;
            }
        }
        return null;
    }

    public void transferir(String cuentaOrigenNum, String cuentaDestinoNum, double monto) {
        CuentaBancaria origen = buscarCuenta(cuentaOrigenNum);
        CuentaBancaria destino = buscarCuenta(cuentaDestinoNum);

        if (origen == null || destino == null) {
            System.out.println("Una o ambas cuentas no existen");
            return;
        }

        if (origen.getSaldo() >= monto) {
            origen.retirar(monto);
            destino.depositar(monto);
            System.out.println("Transferencia realizada con éxito");
        } else {
            System.out.println("Fondos insuficientes para la transferencia");
        }
    }

    public static void main(String[] args) {
        Banco banco = new Banco();

        CuentaBancaria cuenta1 = new CuentaBancaria("Juan Pérez", 1000, "USD");
        CuentaBancaria cuenta2 = new CuentaBancaria("María López", 500, "EUR");

        banco.agregarCuenta(cuenta1);
        banco.agregarCuenta(cuenta2);

        System.out.println("Saldo de " + cuenta1.getTitular() + ": " + cuenta1.getSaldo() + " " + cuenta1.getTipoDeMoneda());
        System.out.println("Saldo de " + cuenta2.getTitular() + ": " + cuenta2.getSaldo() + " " + cuenta2.getTipoDeMoneda());

        banco.transferir(cuenta1.getNumeroCuenta(), cuenta2.getNumeroCuenta(), 200);

        System.out.println("Saldo de " + cuenta1.getTitular() + " después de transferencia: " + cuenta1.getSaldo() + " " + cuenta1.getTipoDeMoneda());
        System.out.println("Saldo de " + cuenta2.getTitular() + " después de transferencia: " + cuenta2.getSaldo() + " " + cuenta2.getTipoDeMoneda());

        double saldoConvertido = cuenta2.convertirA("USD", 1.1);
        System.out.println("Saldo de " + cuenta2.getTitular() + " en USD: " + saldoConvertido);
    }
}