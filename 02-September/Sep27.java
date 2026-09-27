import java.util.Scanner;
public class Sep27{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter item price : ");
        double price = sc.nextDouble();
        System.out.print("Enter quantity : ");
        int quantity = sc.nextInt();
        double subtotal = price * quantity;
        double gst = subtotal * 5 / 100;
        double finalBill = subtotal + gst;
        System.out.println("subtotal : " + subtotal);
        System.out.println("GST (5%) : " + gst);
        System.out.println("Final Bill : " + finalBill);
        sc.close();

    }
}