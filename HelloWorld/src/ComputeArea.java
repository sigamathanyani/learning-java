//THIS PROGRAM COMPUTE THE AREA OF A CIRCLE

import java.util.Scanner;

public class ComputeArea {
    public static void main(String[] args) {
        // The formula is area = pi * radius * radius

        int input;
        double area;

        System.out.print("Choose the shape that you want to calculate an area for " +
                "[1. Square, 2. Circle, 3. Triangle]: ");
        Scanner shape_number = new Scanner(System.in);
        input = shape_number.nextInt();

        if(input == 1){

            System.out.print("Please enter the side size of a square in metres: ");
            Scanner side_input = new Scanner(System.in);
            double side = side_input.nextDouble();
            area = side * side;

        } else if (input == 2) {

            System.out.print("Please enter the radius of a circle in metres: ");
            Scanner circle_input = new Scanner(System.in);
            double radius = circle_input.nextDouble();
            area = 3.1415 * radius * radius;

        } else if (input == 3) {

            System.out.print("Please enter the size of a base of a triangle in metres: ");
            Scanner base_input = new Scanner(System.in);
            double base = base_input.nextDouble();

            System.out.print("Please enter the size of a height of a triangle in metres: ");
            Scanner height_input = new Scanner(System.in);
            double height = height_input.nextDouble();

            area = 0.5 * base * height;

        }else {
            System.out.print("The given input number is Invalid");
            area = 0;
        }

        System.out.print("The area is " + area);

    }
}
