class Teacher {
    private String name;
    private String subject;
    Teacher(String name , String subject){
        this.name=name;
        this.subject=subject;
    }
    void displayTeacher(){
        System.out.println("Teacher Name : " + name);
        System.out.println("Subject : " + subject);        
    }
    String getName(){
        return name;
    }
}
class Student{
    private String name;
    private int rollNumber;
    private Teacher teacher;
    Student(String name,int rollNumber,Teacher teacher){
        this.name=name;
        this.rollNumber=rollNumber;
        this.teacher=teacher;
    }
    void displayStudent(){
        System.out.println("\nStudent Name : " + name);
        System.out.println("Roll Number " + rollNumber);
        System.out.println("Teacher : " + teacher.getName());
    }
}
public class Oct22{
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Ravi", "java");
        Student student1 = new Student("Amar", 101, teacher);
        Student student2 = new Student("Amarnath", 102, teacher);
        teacher.displayTeacher();
        student1.displayStudent();
        student2.displayStudent();

    }
}