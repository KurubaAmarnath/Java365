 class Student {
    String name;
    int age;
    int rollNumber;
    Student(String name,int age,int rollNumber){
        this.name=name;
        this.age=age;
        this.rollNumber=rollNumber;

    }
    void displayDetails(){
        System.out.println("Name : " +this.name);
        System.out.println("Age : " +this.age);   
        System.out.println("Roll Number : " +this.rollNumber);             
    }
    
}
public class Oct03{
    public static void main(String[] args) {
        Student s = new Student("Amar",20,121);
        s.displayDetails();
    }
}
