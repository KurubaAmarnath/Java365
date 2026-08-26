import java.util.Scanner;
public class Aug26{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three sides: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        if(a<=0||b<=0||c<=0){
            System.out.println("Invalid Triangle");
        } else if ( a+b<=c||a+c<=b||b+c<=a){
            System.out.println("Invalid Triangle");
        } else if ( a == b && b == c){
            System.out.println("Equilateral Triangle");
        } else if ( a ==b || b==c || a==c){
            System.out.println("Isosceles Trinagle");
        } else {
            System.out.println("Scalane Trinagle");
        }
        sc.close();
    }
}