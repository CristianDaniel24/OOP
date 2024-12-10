package parte1;
import java.util.Scanner;
public class help2 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Step 1
            int[] accountNumbers = {55, 66, 99};
            double[] accountBalances = {10.0, 40.0, 301.0};
            final double INTEREST_RATE = 0.003;

            // Step 2
            boolean exit = false;

            while (!exit) {
                int accountNumber;
                int choice = displayMenu(scanner);

                switch (choice) {
                    case 1:
                        // Deposit money
                        System.out.println("Enter account number: ");
                        accountNumber = scanner.nextInt();
                        System.out.println("Enter amount to deposit: ");
                        double depositAmount = scanner.nextDouble();
                        depositMoney(accountNumbers, accountBalances, accountNumber, depositAmount);
                        break;
                    case 2:
                        // Withdraw money
                        System.out.println("Enter account number: ");
                        accountNumber = scanner.nextInt();
                        System.out.println("Enter amount to withdraw: ");
                        double withdrawAmount = scanner.nextDouble();
                        withdrawMoney(accountNumbers, accountBalances, accountNumber, withdrawAmount);
                        break;
                    case 3:
                        // Check balance
                        System.out.println("Enter account number: ");
                        accountNumber = scanner.nextInt();
                        checkBalance(accountNumbers, accountBalances, accountNumber);
                        break;
                    case 4:
                        // Calculate interest
                        System.out.println("Enter account number: ");
                        accountNumber = scanner.nextInt();
                        calculateInterest(accountNumbers, accountBalances, accountNumber, INTEREST_RATE);
                        break;
                    case 5:
                        exit = true;
                        break;
                    default:
                        System.out.println("Invalid choice, please try again!");

                }

            }
        }

        public static int displayMenu(Scanner scanner) {
            System.out.println("\nBanking system menu");
            System.out.println("1. Deposit money");
            System.out.println("2. Withdraw money");
            System.out.println("3. Check balance");
            System.out.println("4. Calculate interest");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            return scanner.nextInt();
        }

        public static void depositMoney(int[] accountNumbers, double[] accountBalances, int accountNumber, double depositAmount) {
            for (int i = 0; i < accountNumbers.length; i++) {
                if (accountNumbers[i] == accountNumber) {
                    accountBalances[i] += depositAmount;
                    System.out.println("Deposited " + depositAmount + ". " + "New balance: " + accountBalances[i]);
                    return;
                }
            }
            System.out.println("Account not found!");
        }

        public static void withdrawMoney(int[] accountNumbers, double[] accountBalances, int accountNumber, double withdrawAmount) {
            for (int i = 0; i < accountNumbers.length; i++) {
                if (accountNumbers[i] == accountNumber) {
                    if (accountBalances[i] >= withdrawAmount) {
                        accountBalances[i] -= withdrawAmount;
                        System.out.println("Withdrew " + withdrawAmount + ". New balance: " + accountBalances[i]);
                    } else {
                        System.out.println("Insufficient balance!");
                    }
                    return;
                }
            }
            System.out.println("Account not found!");
        }

        public static void checkBalance(int[] accountNumbers, double[] accountBalances, int accountNumber) {
            for (int i = 0; i < accountNumbers.length; i++) {
                if (accountNumbers[i] == accountNumber) {
                    System.out.println("Current balance: " + accountBalances[i]);
                    return;
                }
            }
            System.out.println("Account not found!");
        }

        public static void calculateInterest(int[] accountNumbers, double[] accountBalances, int accountNumber, double interestRate) {
            for (int i = 0; i < accountNumbers.length; i++) {
                if (accountNumbers[i] == accountNumber) {
                    double interest = accountBalances[i] * interestRate;
                    System.out.println("Interest for account " + accountNumber + ": " + interest);
                    return;
                }
            }
            System.out.println("Account not found!");
        }
    }
