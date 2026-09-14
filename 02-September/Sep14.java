import java.util.Scanner;
public class Sep14{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int number = sc.nextInt();
        while ( number >= 10){
            int sum = 0;
            while ( number > 0){
                sum+=number%10;
                number/=10;
            }
            number = sum;
        }
        System.out.println("Digit root : " + number);
        sc.close();
    }
}