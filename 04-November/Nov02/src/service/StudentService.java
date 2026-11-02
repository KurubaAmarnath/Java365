package service;
import model.Student;
public class StudentService {
    public void displayDetails(Student student) {
        System.out.println("Student Details");
        System.out.println("----------------");
        student.displayStudent();
    }
    public boolean isPassed(Student student) {
        return student.marks >= 40;
    }
}