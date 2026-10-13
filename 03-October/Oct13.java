class Vehicle{
    void start(){
        System.out.println("Vehicle is starting");
    }
}
class Car extends Vehicle{
    @Override 
    void start(){
        System.out.println("Car is starting");
    }

}
public class Oct13{
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        Car c = new Car();
        v.start();
        c.start();
    }
}