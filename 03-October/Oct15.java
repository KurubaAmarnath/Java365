class Person{
    String name;
    Person(String name){
        this.name=name;
    }
}
class Employee extends Person{
    double salary;
    Employee(String name , double salary){
        super(name);
        this.salary = salary;
    }
    void displayDetails(){
        System.out.println("Name : "+name);
        System.out.println("Salary : "+salary);
    }
}
public class Oct15{
    public static void main(String[] args) {
        Employee e = new Employee("Amarnath", 75000.0);
        e.displayDetails();
    }
}
