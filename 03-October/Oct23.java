class Professor {
    String name;
    String subject;

    Professor(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    void displayDetails() {
        System.out.println("Professor Name: " + name);
        System.out.println("Subject: " + subject);
    }
}

class Department {
    String departmentName;
    Professor professor;

    Department(String departmentName, Professor professor) {
        this.departmentName = departmentName;
        this.professor = professor;
    }

    void displayDetails() {
        System.out.println("Department: " + departmentName);
        professor.displayDetails();
    }
}

public class Oct23 {
    public static void main(String[] args) {
        Professor professor = new Professor("Ravi", "Java");

        Department department =
                new Department("Computer Science", professor);

        department.displayDetails();
    }
}