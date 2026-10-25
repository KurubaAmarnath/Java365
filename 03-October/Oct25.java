class Employee {
    void work() {
    System.out.println("Employee is working");
    }
}
class Developer extends Employee {
    @Override
    void work() { System.out.println("Developer is writing code");
    }
    void debugCode() {
    System.out.println("Developer is debugging code");
    }
}
public class Oct25 {
    public static void main(String[] args) {

        Employee employee = new Developer();

        employee.work();

        System.out.println(employee instanceof Employee);
        System.out.println(employee instanceof Developer);

        if (employee instanceof Developer) {
            Developer developer = (Developer) employee;
            developer.debugCode();
        }
    }
}
