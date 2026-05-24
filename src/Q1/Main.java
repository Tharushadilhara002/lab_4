package Q1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // User input
        System.out.print("Enter temperature in Celsius: ");
        double c = input.nextDouble();

        // Object create
        Temperature temp = new Temperature(c);

        // Output
        System.out.println("Temperature in Fahrenheit: "
                + temp.toFahrenheit());
    }
}