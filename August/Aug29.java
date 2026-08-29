import java.util.Scanner;
public class Aug29{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal Amount : ");
        double principal = sc.nextDouble();
        System.out.print("Enter Annual Intrest rate (%) : ");  
        double rate = sc.nextDouble();
        System.out.print("Enter Time Period (Years) : ");
        double time = sc.nextDouble();
        System.out.println();
        double amount = principal;
        for( int i = 1; i<= time; i++){
            amount = amount + ( amount * rate / 100);

        }
        double compoundIntrest = ( amount - principal);
        System.out.println("Compound Intrest: " +compoundIntrest );
        System.out.println("Total Amount : " +amount);
        sc.close();  
    }
}