import  java.util.Scanner;
public class Sep23{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int closestDigit = 0;
        int smallestDifference =10;
        while( n != 0){
            int digit = n % 10;
            int difference = Math.abs(digit);
            if ( difference < smallestDifference){
                smallestDifference = difference;
                closestDigit = digit;
            }
            n/=10;
        }
        System.out.print("Digit Closest to 0 : " + closestDigit);
            sc.close();
    }
}