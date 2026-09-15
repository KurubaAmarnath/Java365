import java.util.Scanner;
public class Sep15{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int number = sc.nextInt();
        int lastDigit = number % 10;
        int firstDigit = number;
        while(firstDigit>=10){
            firstDigit/=10;
        }
        System.out.println("First Digit : " + firstDigit);
        System.out.println("Last Digit : " + lastDigit);
        sc.close();

    }
}