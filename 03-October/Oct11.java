class Student{
    String name;
    static int count = 0;
    Student(String name){
        this.name = name;
        count++;

    }
    static void displayCount(){
        System.out.println("Total Students Created  : " + count);
    }
}
public class Oct11{
    public static void main(String[] args) {
        Student s1 = new Student("Amar");
        Student s2 = new Student("Neha");        
        Student s3 = new Student("Anika");
        Student.displayCount();
    }
}