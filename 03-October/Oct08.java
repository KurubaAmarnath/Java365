import java.util.Scanner;
class Student{
    private String name;
    private int age;
    public void setName(String name){
        this.name  = name;
    }
    public void setAge(int age){
        this.age=age;
    }
}
public class Oct08{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Name : ");
        String name = sc.nextLine();
        System.out.print("Enter Student Age : ");
        int age = sc.nextInt();
        Student s = new Student();
        s.setName(name);
        s.setAge(age);
        sc.close();
    }
}