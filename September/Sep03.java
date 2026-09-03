import java.util.Scanner;
public class Sep03{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        double a = sc.nextDouble();
        System.out.print("Enter Operator ( +, -, *, /): ");
        char operator=sc.next().charAt(0);
         System.out.print("Enter Second  Number : ");
         double b = sc.nextDouble();
         switch(operator){
            case '+':
                System.out.println("Result: "+ (a+b));
                break;
             case '-':
                System.out.println("Result: "+ (a-b));
                break;
            case '*':
                System.out.println("Result: "+ (a*b));
                break;
             case '/':
                if (b!=0){
                System.out.println("Result: "+ (a/b));   
                }else {
                    System.out.println("Cannot Divisible by Zero ");
                }
                break;
                default:
                    System.out.println("Invalid Operator. ");
         }
         sc.close();
    }
}