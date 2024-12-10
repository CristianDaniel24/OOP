package BankAccountManagementSystem;

public class LowInitialDepositException extends Exception {

    private static final String mensaje = "Error: Initial deposit must be at least $100.";

    public LowInitialDepositException() {
        super(mensaje);
    }
}
