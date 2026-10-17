abstract class Shape{
    abstract double calculateArea();
}
class Circle extends Shape{
    double radius;
    Circle(double radius){
        this.radius=radius;
    }
    double calculateArea(){
        double area = Math.PI * radius*radius;
        return area;
    }
}
public class Oct17{
    public static void main(String[] args) {
        Circle c = new Circle(5);
        System.out.println("Circle Area : " + c.calculateArea());
    }
}