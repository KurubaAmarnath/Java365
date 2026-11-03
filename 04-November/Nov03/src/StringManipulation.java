import java.util.Scanner;
public class StringManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        System.out.println("\n--- String Operations ---");
        System.out.println("Original String : " + str);
        System.out.println("Length          : " + str.length());
        System.out.println("Uppercase       : " + str.toUpperCase());
        System.out.println("Lowercase       : " + str.toLowerCase());
        System.out.println("First Character : " + str.charAt(0));
        System.out.println("Last Character  : " + str.charAt(str.length() - 1));
        System.out.println("Trimmed String  : " + str.trim());
        System.out.println("Reversed String : " +new StringBuilder(str).reverse());
        System.out.println("Contains Java  : " + str.contains("Java"));
        System.out.println("Starts with A  : " + str.startsWith("A"));
        System.out.println("Ends with a    : " + str.endsWith("a"));
        sc.close();
    }
}