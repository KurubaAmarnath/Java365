public class NestedTryCatch {
    public static void main(String[] args) {
        try {
            System.out.println("Outer try block started");
            int[] numbers = {10, 20, 30};
            try {
                System.out.println("Inner try block started");
                int result = 10 / 0;
                System.out.println("Result: " + result);
            }
            catch (ArithmeticException e) {
                System.out.println("Inner Exception: " + e);
            }
            try {
                System.out.println("Second inner try block");
                System.out.println(numbers[5]);
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array Exception: " + e);
            }
            System.out.println("Outer try block completed");
        }
        catch (Exception e) {
            System.out.println("Outer Exception: " + e);
        }
        System.out.println("Program continues...");
    }
}