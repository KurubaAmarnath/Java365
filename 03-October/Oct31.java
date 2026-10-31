sealed class Payment permits UPIPayment, CardPayment, CashPayment {

    void processPayment() {
        System.out.println("Processing payment...");
    }
}
final class UPIPayment extends Payment {

    void pay() {
        System.out.println("Payment through UPI");
    }
}
final class CardPayment extends Payment {

    void pay() {
        System.out.println("Payment through Card");
    }
}
non-sealed class CashPayment extends Payment {
    void pay() {
        System.out.println("Payment through Cash");
    }
}
class OnlineCashPayment extends CashPayment {
   void pay() {
        System.out.println("Online Cash Payment");
    }
}
public class Oct31{
    public static void main(String[] args) {
        UPIPayment upi = new UPIPayment();
        CardPayment card = new CardPayment();
        CashPayment cash = new CashPayment();
        OnlineCashPayment online = new OnlineCashPayment();

        upi.pay();
        card.pay();
        cash.pay();
        online.pay();
    }
}