class Processor{
    String brand;
    Processor(String brand){
        this.brand=brand;
    }
    void displayDetails(){
        System.out.println("Processor Brand : " + this.brand);
    }
}
class Computer{
    Processor processor;
    Computer(Processor processor){
        this.processor=processor;
        }
        void displayComputerDetails(){
            processor.displayDetails();
        }
    }
    public class Oct21{
        public static void main(String[] args) {
            Processor processor = new Processor("Intel");
            Computer computer = new Computer(processor);
            computer.displayComputerDetails();
        }
    }
