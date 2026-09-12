import java.util.Scanner;
public class Sep12{
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int number = r.nextInt();
        int product = 1;
        while ( number > 0){
            int digit = number % 10;
            product = product * digit;
            number = number / 10;
        }
        System.out.println("Product of Digits : " + product);
        r.close();
    }
}