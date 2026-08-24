import java.util.Scanner;
public class Aug24{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a  Single Character : ");
        String input =sc.nextLine();

        if(input.length()!=1){
            System.out.println("Invalid input! Please enter exactly one character ");

        } else {
            char ch = input.charAt(0);

        if(Character.isLetter(ch)){
            System.out.println("The entered character is a Alphabet ");
        } else if (Character.isDigit(ch)){
            System.out.println("The entered character is a Digit ");
        } else {
            System.out.println("The entered character is a  Special Character ");
        }
    }
    sc.close();
}
}