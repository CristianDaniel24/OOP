package Instancias2;

public class Ejercicio2 {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Carlos", 1000);

        //Se usa el retorno del metodo para imprimir el nuevo saldo
        double nuevoSaldo = depositarDinero(cuenta, 2000);
        System.out.println("El nuevo saldo es: " + nuevoSaldo);
    }

    public static double depositarDinero(CuentaBancaria cuenta, double monto) {
        cuenta.saldo += monto;
        return cuenta.saldo;
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