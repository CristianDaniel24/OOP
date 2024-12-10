package BankAccountManagementSystem;

public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double depositInitial) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = depositInitial;
    }

    public BankAccount() {
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return this.accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public Double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: " + checkBalance());
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount <= 0) {
            throw new InsufficientFundsException("La cantidad de retiro debe ser mayor que 0");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Error: Insufficient funds");
        }
        balance -= amount;
        System.out.println("\nSuccessful retirement. New balance: " + checkBalance());
    }

    public double checkBalance() {
        return balance;
    }
}
