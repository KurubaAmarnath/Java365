package model;
public class Student {
    public int id;
    public String name;
    public double marks;
    public Student( int id, String name,double marks){
        this.id = id;
        this.name=name;
        this.marks=marks;
    }
    public void displayStudent(){
        System.out.println("student ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Marks : " + marks);

    }
}