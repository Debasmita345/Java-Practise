// Write a program to calculate the vloume of cuboid

import java.util.Scanner;
public class Pratice19122024_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lenght of the cuboid:");
        double lenght = sc.nextDouble();
        System.out.println("Enter the width of the cuboid:");
        double width = sc.nextDouble();
        System.out.println("Enter the height of the cuboid:");
        double height = sc.nextDouble();
        double volume = lenght * width * height;
        System.out.printf("The volume of the cuboid is: %.2f cubic units %n", volume);
    }
    
}
