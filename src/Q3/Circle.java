package Q3;

public class Circle {

    // Variable
    private double radius;

    // No-Argument Constructor
    public Circle() {
        radius = 0;
    }

    // Parameterized Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Setter Method
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Compute Area
    public double computeArea() {
        return Math.PI * radius * radius;
    }

    // Compute Circumference
    public double computeCircumference() {
        return 2 * Math.PI * radius;
    }
}