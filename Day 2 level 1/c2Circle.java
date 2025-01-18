public class Circle {
    private double radius; // Radius of the circle

    // Default constructor initializing with a default radius
    public Circle() {
        this(1.0); // Default radius
    }

    // Parameterized constructor initializing with a provided radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to calculate the area of the circle
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate the circumference of the circle
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        // Create a circle using the default constructor
        Circle circle1 = new Circle();
        System.out.println("Default Circle:");
        System.out.println("Radius: " + circle1.getRadius());
        System.out.println("Area: " + circle1.calculateArea());
        System.out.println("Circumference: " + circle1.calculateCircumference());

        // Create a circle with a radius of 5.0
        Circle circle2 = new Circle(5.0);
        System.out.println("\nCircle with Radius 5.0:");
        System.out.println("Radius: " + circle2.getRadius());
        System.out.println("Area: " + circle2.calculateArea());
        System.out.println("Circumference: " + circle2.calculateCircumference());
    }
}
