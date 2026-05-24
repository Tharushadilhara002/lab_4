package Q3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input inner radius
        System.out.print("Enter inner radius: ");
        double ri = input.nextDouble();

        // Input outer radius
        System.out.print("Enter outer radius: ");
        double ro = input.nextDouble();

        // Create objects
        Circle innerCircle = new Circle(ri);
        Circle outerCircle = new Circle(ro);

        // Calculate shaded area
        double shadedArea =
                outerCircle.computeArea()
                        - innerCircle.computeArea();

        // Output
        System.out.println("Shaded Area: " + shadedArea);

        System.out.println("Outer Circle Circumference: "
                + outerCircle.computeCircumference());
    }
}