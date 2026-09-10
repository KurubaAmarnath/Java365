import java.util.Scanner;
public class Sep10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int number = sc.nextInt();
        int evenSum=0;
        int oddSum=0;
        while ( number > 0){
            int digit = number% 10;
            if ( digit % 2 == 0){
                evenSum+=digit;
            } else {
                oddSum+=digit;
            }
            number = number / 10;
        }
        System.out.println("Even Digit Sum : " + evenSum);
        System.out.println("Odd Digit Sum : " + oddSum);
        sc.close();
    }
}