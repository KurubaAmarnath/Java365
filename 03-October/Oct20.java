class Payment{
    void pay(){
        System.out.println("General Payment");
    }
}
class UPIPayment extends Payment{
    @Override 
    void pay(){
        System.out.println("Processing Payment Through UPI");
    }
}
class CardPayment extends Payment{
    @Override 
    void pay(){
        System.out.println("Processing Payment Through Card");
    }
}
public class Oct20{
    public static void main(String[] args) {
        Payment payment = new UPIPayment();
        payment.pay();
        payment = new CardPayment();
        payment.pay();
    

    }
}