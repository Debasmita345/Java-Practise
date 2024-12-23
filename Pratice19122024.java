//Write a program to calculate the average of three numbers

import java.util.Scanner;
public class Pratice19122024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        double num_1 = sc.nextDouble();
        System.out.println("Enter the second number:");
        double num_2 = sc.nextDouble();
        System.out.println("Enter the third number:");
        double num_3 = sc.nextDouble();
        double average = (num_1 + num_2 + num_3)/3;
        System.out.printf("The average of the three numbers is: %.2f %n", average);


    }
    
}
