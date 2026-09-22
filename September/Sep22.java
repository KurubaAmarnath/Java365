import java.util.Scanner;
public class Sep22{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        int closestDigit = 0;
        int smallestDifference = 10;
        while( n != 0){
            int digit = n % 10;
            int difference = Math.abs(digit - 5);
            if ( difference < smallestDifference){
                smallestDifference = difference;
                closestDigit = digit;
            }
            n/=10;
        }
        System.out.println("Digit Closest to 5 : " + closestDigit);
        sc.close();
    }
}