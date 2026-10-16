class BankAccount{
    final int ACCOUNT_NUMBER;
    double balance;
    BankAccount(int ACCOUNT_NUMBER,double balance){
        this.ACCOUNT_NUMBER=ACCOUNT_NUMBER;
        this.balance=balance;
    }
    void deposit(double amount){
        balance = balance+amount;
    }
    void displayDetails(){
        System.out.println("Account Number : " + ACCOUNT_NUMBER);
        System.out.println("Balance : " + balance);
    }

}
public class Oct16{
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(101, 5000.0);
        acc.deposit(10000);
        acc.displayDetails();
    }
}