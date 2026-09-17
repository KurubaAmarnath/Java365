import java.util.Scanner;
public class Sep17{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int number = sc.nextInt();
        int count = 0;
        String digits = "";
        while ( number > 0){
            int digit = number % 10;
            if ( digit > 5){
                digits = digit + " " + digits;
                count++;
            }
            number/=10;
        }
        System.out.println("Digits greater than 5 : " + digits);
        System.out.println("Count : " + count);
        sc.close();
    }
}