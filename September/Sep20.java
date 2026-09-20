import java.util.Scanner;
public class Sep20{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int number = sc.nextInt();
        int temp = number;
        int count = 0;
        while ( temp != 0){
            count++;
            temp/=10;
        }
        if ( count % 2 == 0){
            System.out.println("No single middle digit");
        } else {
            int middlePosition = count / 2;
            for ( int i = 0; i<middlePosition; i++){
                number/=10;
            }
            int middleDigit = number % 10;
            System.out.println("Middle digit : " + middleDigit);
        }
        sc.close();
    }
}
