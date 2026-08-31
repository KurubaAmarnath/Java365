import java.util.Scanner;

public class Aug31 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Units Consumed: ");
        double units = sc.nextDouble();

        double amount = 0;

        if (units < 0) {
            System.out.println("Enter valid units.");
        } 
        else if (units <= 50) {
            amount = units * 1.50;
        } 
        else if (units <= 100) {
            amount = (50 * 1.50) +
                     ((units - 50) * 2.50);
        } 
        else if (units <= 200) {
            amount = (50 * 1.50) +
                     (50 * 2.50) +
                     ((units - 100) * 4.00);
        } 
        else if (units <= 300) {
            amount = (50 * 1.50) +
                     (50 * 2.50) +
                     (100 * 4.00) +
                     ((units - 200) * 5.50);
        } 
        else {
            amount = (50 * 1.50) +
                     (50 * 2.50) +
                     (100 * 4.00) +
                     (100 * 5.50) +
                     ((units - 300) * 7.00);
        }

        if (units >= 0) {
            System.out.println("Electricity Bill: ₹" + amount);
        }

        sc.close();
    }
}