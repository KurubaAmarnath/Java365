interface Payment{
    void pay(double amount);
}
class UPIPayment implements Payment{
    @Override 
    public void pay(double amount){
        System.out.println("Paid "+amount+" using UPI");
    }
}
public class Oct18{
    public static void main(String[] args) {
        Payment payment = new UPIPayment();
        payment.pay(500);
    }
}