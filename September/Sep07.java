import java.util.Scanner;
public class Sep07{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Elements : ");
        int number = sc.nextInt();
        int result = 0;
        System.out.println("Enter "+ number + " numbers : ");
        for ( int i = 0; i < number; i++){
            result = result ^ sc.nextInt();
        }
        System.out.println("Number appearing odd number of times : " + result);
        sc.close();
    }
}