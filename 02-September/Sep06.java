import java.util.Scanner;
public class Sep06{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int number = sc.nextInt();
        int count = 0;
        while ( number != 0){
            number = number & (number - 1);
            count++;
        }
        System.out.println("Number of Set bits : " + count );
        sc.close();
    }
}
    
