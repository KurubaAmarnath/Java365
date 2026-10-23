class Employee {
    public String name;
    private double salary;
    protected String department;
    int employeeId; // Default access

    Employee(String name, double salary,
             String department, int employeeId) {
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.employeeId = employeeId;
    }
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
        System.out.println("Employee ID: " + employeeId);
    }
}

public class Oct24 {
    public static void main(String[] args) {
        Employee employee = new Employee(
            "Amar", 35000, "Engineering", 101
        );
        employee.displayDetails();
    }
}