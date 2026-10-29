class Employee implements Cloneable {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public Employee clone() {
        try {
            return (Employee) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

public class Oct29 {
    public static void main(String[] args) {
        Employee original = new Employee("Amar", 35000);
        Employee copy = original.clone();

        System.out.println("Original Employee:");
        original.displayDetails();

        System.out.println("\nCloned Employee:");
        copy.displayDetails();
    }
}
