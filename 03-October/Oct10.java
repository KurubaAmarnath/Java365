public class Oct10{
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("Amar");
        Employee e3 = new Employee("Amarnath",75000.0);  
        System.out.println("Employee 1 : "+e1.name + ", Salary : " +e1.salary);  
        System.out.println("Employee 2 : "+e2.name + ", Salary : " +e2.salary);
        System.out.println("Employee 3 : "+e3.name + ", Salary : " +e3.salary);                    

    }
}


class Employee{
    String name;
    double salary;
    Employee(){}
    Employee(String name){
        this.name = name;
    }
    Employee(String name,double salary){
        this.name=name;
        this.salary = salary;
    }
}