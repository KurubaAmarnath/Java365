import java.util.Scanner;
public class Sep26{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Purchase amount : ");
        double amount = sc.nextDouble();
        double discountRate;
        if ( amount < 1000){
            discountRate = 0;
        } else if ( amount < 5000){
            discountRate = 10;
        } else if ( amount < 10000){
            discountRate = 15;
        } else {
            discountRate = 20;
        }
        double discountAmount = amount * discountRate / 100;
        double finalAmount = amount - discountAmount;
        System.out.println("Discount : " + discountRate  + "%");
        System.out.println("Discount Amount : " + discountAmount);
        System.out.println("Final Amount : " + finalAmount);
        sc.close();
    }
}