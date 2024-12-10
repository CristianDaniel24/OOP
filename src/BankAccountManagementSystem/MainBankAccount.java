package BankAccountManagementSystem;

import java.util.Scanner;

public class MainBankAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BankAccount bankAccount = new BankAccount();
        boolean depositTrue = false;
        double depositInitial;

        while (!depositTrue) {
            System.out.println("\nPress enter to start");
            scanner.nextLine();
            try {
                System.out.println("\nEnter account number:");
                String numberAccount = scanner.nextLine();
                System.out.println("Enter account holder name:");
                String name = scanner.nextLine();
                System.out.println("Enter initial deposit:");
                String input = scanner.nextLine();

                depositInitial = Double.parseDouble(input);
                montInitial(depositInitial);

                bankAccount.setAccountNumber(numberAccount);
                bankAccount.setAccountHolderName(name);
                bankAccount.deposit(depositInitial);
                bankAccount.checkBalance();
                depositTrue = true;
            } catch (NumberFormatException e) {
                System.out.println("Enter the number Please!!");
            } catch (LowInitialDepositException e) {
                System.out.println(e.getMessage());
            }
        }

        boolean exit = false;
        while (!exit) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.println("Option:");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    deposit(scanner, bankAccount);
                    break;
                case 2:
                    withdraw(scanner, bankAccount);
                    break;
                case 3:
                    System.out.println("Current balance: " + bankAccount.checkBalance());
                    break;
                case 4:
                    System.out.println("Bye..");
                    exit = true;
                    break;
                default:
                    System.out.println("\nThe option is invalid");
            }
        }
    }

    private static void withdraw(Scanner scanner, BankAccount bankAccount) {
        try {
            double amoutwithdraw;
            scanner.nextLine();
            System.out.println("\nEnter amount to withdraw:");
            String input = scanner.nextLine();
            amoutwithdraw = Double.parseDouble(input);
            try {
                bankAccount.withdraw(amoutwithdraw);
            } catch (InsufficientFundsException e) {
                System.out.println("Error when withdrawing money: " + e.getMessage());
            }
        } catch (NumberFormatException e) {
            System.out.println("Enter the number for withdraw, Please!!");
        }
    }

    private static void deposit(Scanner scanner, BankAccount bankAccount) {
        try {
            double amount;
            scanner.nextLine();
            System.out.println("\nEnter amount to deposit:");
            String input = scanner.nextLine();
            amount = Double.parseDouble(input);
            bankAccount.deposit(amount);
        } catch (NumberFormatException e) {
            System.out.println("Enter the number for deposit, Please!!");
        }
    }

    //EXCEPTIONS
    public static void montInitial(Double balance) throws LowInitialDepositException {
        if (balance <= 100) {
            throw new LowInitialDepositException();
        }
    }
}