import java.util.Scanner;
public class Aug27{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Cost Price : ");
        double CostPrice = sc.nextDouble();
        System.out.print("Enter Selling Price : ");
        double SellingPrice = sc.nextDouble();
        
        if(SellingPrice>CostPrice){
            double Profit = SellingPrice - CostPrice;
            System.out.println("Profit = " +Profit);
        } else if (SellingPrice<CostPrice){
            double Loss = CostPrice - SellingPrice;
            System.out.println("Loss = " +Loss);
        }else {
            System.out.println("No Profit , No Loss ");
        }
        sc.close();

    }
}