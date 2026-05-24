package Q2;

public class Temperature {

    // Variable
    private double celsius;

    // No-Arg Constructor
    public Temperature() {
        celsius = 0;
    }

    // Parameterized Constructor
    public Temperature(double celsius) {
        this.celsius = celsius;
    }

    // Getter Method
    public double toCelsius() {
        return celsius;
    }

    // Convert to Fahrenheit
    public double toFahrenheit() {
        return (celsius * 9 / 5) + 32;
    }

    // Setter using Celsius
    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    // Setter using Fahrenheit
    public void setFahrenheit(double fahrenheit) {
        this.celsius = (fahrenheit - 32) * 5 / 9;
    }
}