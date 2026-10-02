class Student{
    String name;
    int age;
    double marks;
    Student(String name, int age, double marks){
        this.name = name;
        this.age=age;
        this.marks=marks;
    }
}
public class Oct02{
    public static void main(String[] args) {
        Student student = new Student("Amarnath",20,99);
        System.out.println("Name : " + student.name);
        System.out.println("Age : " + student.age);
        System.out.println("Marks : " + student.marks);
    }
}