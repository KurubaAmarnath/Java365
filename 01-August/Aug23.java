import java.util.Scanner;
public class Aug23{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Alphabet: ");
        char ch = sc.next().charAt(0);
        if(!Character.isLetter(ch)){
            System.out.println("Invalid input. Please enter an alphabet. ");
        }else{
        switch (Character.toLowerCase(ch)) {
            case 'a', 'e' , 'i' , 'o' , 'u' ->
                 System.out.println(ch +" is a vowel.");
                 default ->
                  System.out.println(ch +" is a consonant. ");
        }
    }
        sc.close();
    }
}