import java.util.Scanner;
public class Aug21 {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number =sc.nextInt();
    if (number >0){
        System.out.println("Postive");
        
    }
else if (number<0){
    System.out.println("Negative");

}
else{
    System.out.println("Zero");
}
sc.close();
    
 }

    
}
