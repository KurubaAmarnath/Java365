import java.util.Scanner;
public class Aug25{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three side lengths : ");
        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();
        // Validate triangle using the triangle inequality theorem
        boolean isValid = side1 > 0 && side2 > 0 && side3 > 0
                    && side1 + side2 > side3
                    && side2 + side3 > side1
                    && side1 + side3 > side2;
            if(isValid){
                System.out.println("The given sides form a valid triangle. ");
            } else {
                System.out.println("The given sides do not form a valid triangle. ");
            }
            sc.close();
    }
}