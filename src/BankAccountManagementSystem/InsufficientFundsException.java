package BankAccountManagementSystem;

public class InsufficientFundsException extends Exception {

    public InsufficientFundsException(String mensaje) {
        super(mensaje);
    }
}
