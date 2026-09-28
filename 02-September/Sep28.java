import java.util.Scanner;
public class Sep28{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter basic salary : ");
        double salary = sc.nextDouble();
        double hra = salary * 20 / 100;
        double da = salary * 10 / 100;
        double grossSalary = salary +  hra + da;
        System.out.println("HRA : " + hra);
        System.out.println("DA : " + da);
        System.out.println("Gross Salary : " + grossSalary);
        sc.close();
    }
}