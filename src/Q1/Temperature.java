package Q1;

public class Temperature {

    // Variable
    private double celsius;

    // No-Argument Constructor
    public Temperature() {
        celsius = 0;
    }

    // Parameterized Constructor
    public Temperature(double celsius) {
        this.celsius = celsius;
    }

    // Convert to Celsius
    public double toCelsius() {
        return celsius;
    }

    // Convert to Fahrenheit
    public double toFahrenheit() {
        return (celsius * 9 / 5) + 32;
    }

    // Set Celsius
    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    // Set Fahrenheit
    public void setFahrenheit(double fahrenheit) {
        this.celsius = (fahrenheit - 32) * 5 / 9;
    }
}