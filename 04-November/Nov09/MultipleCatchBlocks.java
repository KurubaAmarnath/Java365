public class MultipleCatchBlocks {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int result = a / b;
            System.out.println("Result: " + result);
            int[] numbers = {10, 20, 30};
            System.out.println(numbers[5]);
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: Division by zero");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Exception: Invalid array index");
        }
        catch (Exception e) {
            System.out.println("General Exception: " + e.getMessage());
        }
        finally {
            System.out.println("Finally block executed.");
        }
        System.out.println("Program continues...");
    }
}