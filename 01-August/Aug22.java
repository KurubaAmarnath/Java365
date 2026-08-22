import java.util.Scanner;
public class Aug22{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Four Numbers: ");
        int a =sc.nextInt();
        int b =sc.nextInt();
        int c =sc.nextInt();
        int d =sc.nextInt();
        int largest =a;
        if(b>largest) largest=b;
        if(c>largest) largest=c;
        if(d>largest) largest=d;
        System.out.println("Largest Number :"+largest);
        sc.close();
        
    }

}