class Employee{
    String name;
    double salary;
    Employee( String name, double salary){
        this.name = name;
        this.salary= salary;
    }
}
public class Oct05{
    public static void main(String[] args) {
        Employee e = new Employee("Amarnath", 75000.990);
        System.out.println("Employee Name : " + e.name);
        System.out.println("Employee Salary : " + e.salary);
    }
}