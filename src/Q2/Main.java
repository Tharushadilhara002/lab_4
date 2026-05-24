package Q2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Object create
        Temperature temp = new Temperature();

        // User input
        System.out.print("Enter temperature in Fahrenheit: ");
        double f = input.nextDouble();

        // Set Fahrenheit
        temp.setFahrenheit(f);

        // Output Celsius
        System.out.println("Temperature in Celsius: "
                + temp.toCelsius());
    }
}