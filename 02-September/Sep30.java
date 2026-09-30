import  java.util.Scanner;
public class Sep30{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account balance : ");
        double balance = sc.nextDouble();
        System.out.print("Enter withdrawal amount : ");
        double withdrawal = sc.nextDouble();
        if ( withdrawal <= 0){
            System.out.println("Invalid withdrawal amounnt");
        }else if( withdrawal % 100 != 0){
            System.out.println("Amount must be multiple of 100");
        } else if (withdrawal > balance){
            System.out.println("Insufficient balance");
        } else {
            balance = balance - withdrawal;

        System.out.println("withdrawal Successful");
        System.out.println("Remaining balance : " + balance);
        }
        sc.close();
    }
}