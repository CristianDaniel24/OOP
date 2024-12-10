package Instancias;

public class Ejercicio3 {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Carlos", 1000);
        depositarDinero(cuenta, 2000);
        System.out.println("El nuevo saldo es: " + cuenta.saldo);
    }

    public static void depositarDinero(CuentaBancaria cuenta, double monto) {
        cuenta.saldo += monto;
    }

    public static class CuentaBancaria {
        String titular;
        double saldo;

        CuentaBancaria(String titular, double saldo) {
            this.titular = titular;
            this.saldo = saldo;
        }
    }
}
