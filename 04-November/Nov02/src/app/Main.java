package app;
import model.Student;
import service.StudentService;
public class Main {
    public static void main(String[] args) {
        Student student = new Student(101, "Amar", 85.5);
        StudentService service = new StudentService();
        service.displayDetails(student);
        if (service.isPassed(student)) {
            System.out.println("Result : PASS");
        } else {
            System.out.println("Result : FAIL");
        }
    }
}