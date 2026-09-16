import java.util.Scanner;
public class Sep16{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter  a Number : ");
         int number = sc.nextInt();
         int largest = 0;
         int temp = number;
         while(temp>0){
            int digit = temp % 10;
            if ( digit > largest ){
                largest = digit;
            }
            temp/=10;
         }
            int frequency = 0;
            temp = number;
            while ( temp > 0){
                int digit = temp % 10;
                if ( digit == largest ){
                    frequency++;
                }
                temp/=10;
            }
            System.out.println("Largest Digit : " + largest);
            System.out.println("Frequncy of Largest Digit : " + frequency);
            sc.close();
         }
    }
