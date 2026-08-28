import java.util.Scanner;
public class Aug28{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Pricipal Amount : ");
        double principle = sc.nextDouble();
        System.out.print("Enter rate of Intrest (%) : ");
        double rate = sc.nextDouble();
        System.out.print("Enter Time (years) :");
        double time = sc.nextDouble();

        double simpleintrest= ( principle * rate * time ) / 100;
        System.out.println("Simple Intrest : "+simpleintrest);
        sc.close();
     }
}