import java.util.Scanner;
public class Sep24{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        int count = 0;
        while ( temp != 0){
            int digit = temp % 10;
            sum+=digit;
            count++;
            temp/=10;
        }
        double average = (double) sum / count;
        temp = n;
        int greaterCount = 0;
        while ( temp != 0){
            int digit = temp %  10;
            if ( digit > average){
                greaterCount++;
            }
            temp/=10;
        }
        System.out.println("Average digit : " + average);
        System.out.println("Count : " + greaterCount);
        sc.close();

    }
}