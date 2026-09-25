import java.util.Scanner;
public class Sep25{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        int maxFrequency = 0;
        int mostFrequencyDigit = 0;
        for( int digit = 0; digit <= 9 ; digit++){
            int temp = n;
            int frequency  = 0;
            while ( temp != 0){
                int currentDigit = temp % 10;
                if ( currentDigit == digit){
                    frequency++;
                }
                temp /= 10;
            }
            if( frequency > maxFrequency){
                maxFrequency = frequency;
                mostFrequencyDigit = digit;
            }
        }
        System.out.println("Most Frequent digit : " + mostFrequencyDigit);
        System.out.println("Frequency : " + maxFrequency);
        sc.close();
    }
}
        