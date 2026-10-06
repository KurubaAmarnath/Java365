import java.util.Scanner;
class Student{
    private String name;
    private int age;
    public void  setStudent(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
public class Oct06{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name : ");
        String name = sc.nextLine();
        System.out.print("Enter Age : ");
        int age = sc.nextInt();
        Student s = new Student();
        s.setStudent(name, age);
        s.getName();
        s.getAge();
        System.out.println("Student Name " + s.getName());
        System.out.println("Student Age : " + s.getAge());
        sc.close();
    }
}