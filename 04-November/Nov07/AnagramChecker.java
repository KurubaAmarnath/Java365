import java.util.Scanner;
public class AnagramChecker {
    public static boolean isAnagram(String first, String second) {
        first = first.toLowerCase().replace(" ", "");
        second = second.toLowerCase().replace(" ", "");
        if (first.length() != second.length()) {
            return false;
        }
        int[] frequency = new int[26];
        for (int i = 0; i < first.length(); i++) {
            frequency[first.charAt(i) - 'a']++;
        }
        for (int i = 0; i < second.length(); i++) {
            frequency[second.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (frequency[i] != 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First String: ");
        String first = sc.nextLine();
        System.out.print("Enter Second String: ");
        String second = sc.nextLine();
        if (isAnagram(first, second)) {
            System.out.println("Result: Anagram");
        } else {
            System.out.println("Result: Not Anagram");
        }
        sc.close();
    }
}