import java.util.Scanner;
public class Sep04{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First  Number : ");
        int firstnumber = sc.nextInt();
        System.out.print("Enter Second Number : ");
        int secondnumber = sc.nextInt();
        System.out.println("\nBefore Swapping  ");
        System.out.println("First Number : " + firstnumber);
        System.out.println("Second Number : " + secondnumber);
        // Swaping without third variable
        firstnumber=firstnumber+secondnumber;
        secondnumber=firstnumber-secondnumber;
        firstnumber=firstnumber-secondnumber;
        System.out.println("\nAfter Swapping  ");
        System.out.println("First Number : " + firstnumber);
        System.out.println("Second Number : " + secondnumber);
        sc.close();
    }
}