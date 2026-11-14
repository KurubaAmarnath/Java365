import java.util.Scanner;
// Custom Exception
class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException(String message) {
        super(message);
    }
}
// Bank Account Class
class BankAccount {
    private double balance;
    public BankAccount(double balance) {
        this.balance = balance;
    }
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException(
                "Deposit amount must be positive."
            );
        }
        balance += amount;
        System.out.println("Deposit Successful!");
    }
    public void withdraw(double amount)
            throws InsufficientBalanceException {
        if (amount <= 0) {
            throw new IllegalArgumentException(
                "Withdrawal amount must be positive."
            );
        }
        if (amount > balance) {
            throw new InsufficientBalanceException(
                "Insufficient account balance."
            );
        }
        balance -= amount;
        System.out.println("Withdrawal Successful!");
    }
    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}
// Main Class
public class BankAccountSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount(5000);
        try {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double deposit = sc.nextDouble();
                    account.deposit(deposit);
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawal = sc.nextDouble();
                    account.withdraw(withdrawal);
                    break;

                case 3:
                    account.displayBalance();
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
        catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
        catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Invalid Input!");
        }
        finally {
            System.out.println("Thank you for using our banking system.");
            sc.close();
        }
    }
}