record Student(int id, String name, double marks) {
}

public class Oct30 {
    public static void main(String[] args) {

        Student s1 = new Student(101, "Amar", 95.5);
        Student s2 = new Student(102, "Rahul", 88.0);
        Student s3 = new Student(101, "Amar", 95.5);

        // Display record objects
        System.out.println("Student 1: " + s1);
        System.out.println("Student 2: " + s2);

        // Access record components
        System.out.println("ID: " + s1.id());
        System.out.println("Name: " + s1.name());
        System.out.println("Marks: " + s1.marks());

        // Compare records
        System.out.println("s1 equals s2: " + s1.equals(s2));
        System.out.println("s1 equals s3: " + s1.equals(s3));

        // Hash codes
        System.out.println("s1 hashCode: " + s1.hashCode());
        System.out.println("s3 hashCode: " + s3.hashCode());
    }
}
