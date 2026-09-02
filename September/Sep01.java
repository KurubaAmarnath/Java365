import java.util.Scanner;
public class Sep01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Month (1-12) : ");
        if(!sc.hasNextInt()){
            System.out.println("Invalid Input..");
            sc.close();
            return;
        }
        int month = sc.nextInt();
        switch(month){
            case 1: 
            case 3: 
            case 5: 
            case 7: 
            case 8: 
            case 10:
            case 12:
            System.out.println("31 Days ");
            break;
            case 4:
            case 6: 
            case 9: 
            case 11: 
            System.out.println("30 Days ");
            break;
            case 2:
            System.out.println("February has 28 Days in a Normal year ");
            System.out.println("February has 29 Days in a Leap year ");
            break;

            default:
                System.out.println("Invalid month Number. ");
        }
        sc.close();
    }
}