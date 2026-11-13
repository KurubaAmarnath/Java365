import java.util.Scanner;
// Custom Exception Class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
public class CustomExceptionDemo {
    public static void validateAge(int age)
            throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException(
                "Age must be 18 or above."
            );
        }
        System.out.println("Age validation successful.");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        try {
            validateAge(age);
        }
        catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        sc.close();
    }
}