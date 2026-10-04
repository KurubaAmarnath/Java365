class BankAccount{
    private double balance;
     void deposit(double amount){
        balance = balance + amount;
    }
    double getBalance(){
        return balance;
    }
}
public class Oct04{
    public static void main(String[] args) {
      BankAccount account = new BankAccount();
      account.deposit(5000);
      System.out.println("Balance: " + account.getBalance());
      account.deposit(2000);
      System.out.println("Balance: " + account.getBalance());  
    }
}