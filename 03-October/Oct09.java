class Calculator{
    int add(int a ,int b){
        return a+b;
    }
    int add( int a ,int b,int c){
        return a+b+c;
    }
    double add( double a, double b){

        return a+b;
    }
}
public class Oct09{
    public static void main(String[] args) {
        Calculator c = new Calculator();
       System.out.println("Sum of two Integers " +  c.add(7,13));
       System.out.println("Sum of Three Integers " + c.add(7,13,15));
       System.out.println("Sum of Two Decimal Numbers " + c.add(7.0, 13.5));
    }
}