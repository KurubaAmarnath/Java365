class Student {
    String name;
    int age;
    double marks;

}
public class Oct01 {
    public static void main(String[] args) {
        Student student = new Student();

        student.name = "Amarnath";
        student.age = 20;
        student.marks = 99;

        System.out.println("Name : " + student.name);
        System.out.println("Age : " + student.age);
        System.out.println("marks : " + student.marks);
    }
}