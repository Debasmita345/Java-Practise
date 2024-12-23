//Write a program to calculate the profit percentage upon selling a product cost price and selling price are given by the user

import java.util.Scanner;
public class Pratice19122024_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Costprice:");
        double CostPrice = sc.nextDouble();
        System.out.print("Enter the Sellingprice:");
        double SellingPrice = sc.nextDouble();
        double profit = SellingPrice - CostPrice;
        double ProfitPercentage = (profit / CostPrice) * 100;
        System.out.println(ProfitPercentage);
        
    }
    
}
