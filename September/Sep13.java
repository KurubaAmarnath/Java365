import java.util.Scanner;
public class Sep13{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int number = sc.nextInt();
        System.out.print("Enter the digits to count : ");
        int target = sc.nextInt();
        int count = 0;
        while ( number > 0){
            int digit = number % 10;
            if( digit == target){
                count++;
            }
            number = number / 10;
        }
        System.out.println("Digit " + target + " occurs " + count + " time(s)");
        sc.close();
    }
}