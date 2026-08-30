import java.util.Scanner;

public class Aug30{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Annual Income : ");
        double income = sc.nextDouble();

        double tax;

        // Tax Regime Slabs (2026-27):
        // Up to ₹4,00,000         - 0%
        // ₹4,00,001 – ₹8,00,000   - 5%
        // ₹8,00,001 – ₹12,00,000  - 10%
        // ₹12,00,001 – ₹16,00,000 - 15%
        // ₹16,00,001 – ₹20,00,000 - 20%
        // ₹20,00,001 – ₹24,00,000 - 25%
        // Above ₹24,00,000        - 30%

        if (income <= 400000) {
            tax = 0;
        } else if (income <= 800000) {
            tax = (income - 400000) * 0.05;
        } else if (income <= 1200000) {
            tax = 20000 + (income - 800000) * 0.10;
        } else if (income <= 1600000) {
            tax = 60000 + (income - 1200000) * 0.15;
        } else if (income <= 2000000) {
            tax = 120000 + (income - 1600000) * 0.20;
        } else if (income <= 2400000) {
            tax = 200000 + (income - 2000000) * 0.25;
        } else {
            tax = 300000 + (income - 2400000) * 0.30;
        }

        double remainingAmount = income - tax;

        System.out.println("Income Tax : ₹" + tax);
        System.out.println("Remaining Amount : ₹" + remainingAmount);

        sc.close();
    }
}