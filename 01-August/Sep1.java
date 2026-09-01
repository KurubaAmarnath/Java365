import java.util.Scanner;
public class Sep1{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Year : ");
        if(!sc.hasNextInt()){
            System.out.println("Invalid Input. Please enter a valid year :");
            sc.close();
            return;
        }
        int year = sc.nextInt();
        if(year <= 0){
            System.out.println("Invalid Year . Year must be Positive ");
        }else if ( year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            System.out.println(year + " has 366 Days ");
        } else {
            System.out.println(year + " has 365 Dyas");
        }
        sc.close();
    }
}