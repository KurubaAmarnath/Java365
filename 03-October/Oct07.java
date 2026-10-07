class Student{
    private String name;
    private int age;
    Student( String name, int age){
        this.name= name;
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
public class Oct07{
    public static void main(String[] args) {
        Student s = new Student("Amarnath", 20);
        System.out.println("Student Name : " + s.getName());
        System.out.println("Student Age : " + s.getAge());
    }
}