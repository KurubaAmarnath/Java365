import java.util.Scanner;
public class Sep18{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int number = sc.nextInt();
        System.out.print("Enter the Digit to Remove : ");
        int remove = sc.nextInt();
        int result = 0;
        int place = 1;
        while ( number > 0){
            int digit = number % 10;
            if ( digit != remove ){
                result=result+digit*place;
                place = place*10;
            }
            number = number / 10;
        }
        System.out.println("Number After Removing " + remove + " : " + result);
        sc.close();
    }
}