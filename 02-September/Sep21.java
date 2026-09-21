import java.util.Scanner;
public class Sep21{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = sc.nextInt();
        int count3 = 0;
        int count5 = 0;
        while(number != 0){
            int digit = number % 10;
            if ( digit % 3 == 0){
                count3++;
            }
            if ( digit % 5 == 0){
                count5++;
            }
            number/=10;  
        }
        System.out.println("Count Divisible by 3 : " + count3);
        System.out.println("Count Divisible by 5 : " + count5);
        sc.close();
    }
}