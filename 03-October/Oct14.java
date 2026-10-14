class Vehicle{
    String brand = "Toyota";
    void display(){
        System.out.println("Parent Brand : " + brand);
    }
}
class Car extends  Vehicle{
    String brand = "Porsche";
    void showBrands(){
    System.out.println("Parent Brand : " + super.brand);
    System.out.println("car Brand : " + this.brand);
    }
}
public class Oct14{
    public static void main(String[] args) {
        Car c = new Car();
        c.showBrands();
    }
}