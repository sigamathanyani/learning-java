//THIS PROGRAM COMPUTE THE AREA OF A CIRCLE

import java.util.Scanner;

public class ComputeArea {
    public static void main(String[] args) {
        // The formula is area = pi * radius * radius

        double radius;
        double area;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the radius of a circle: ");
        radius = input.nextDouble();

        area = 3.14159 * radius * radius;

        System.out.println("The area of radius " + radius + " is " + area);
    }
}
