class Vehicle{
    String brand;
    void start(){
        System.out.println("Vehicle is starting");
    }
}
class Car extends Vehicle{
    String fuelType;
}
public class Oct12{
    public static void main(String[] args) {
        Car c = new Car();
        c.brand="Porshe 911";
        c.fuelType="petrol";
        System.out.println("Car Brand : " + c.brand);
        System.out.println(c.brand +" Fuel Type : " + c.fuelType);
        c.start();
    }
}