import java.util.Scanner;
public class Sep05{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.print("Enter a Number : ");
       int number = sc.nextInt();
       if ( number > 0 && ( number & ( number - 1 )) == 0){
        System.out.println(number + " is a power of 2");
       }
       else {
        System.out.println(number + " is not a power of 2");
       }
       sc.close();
    }
}