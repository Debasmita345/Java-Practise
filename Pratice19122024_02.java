//Write a program to calculate the area of circle

import java.util.Scanner;
public class Pratice19122024_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle:");
        double radius = sc.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("The area of the circle with radius" + radius + " " + area);
    }
    
}
