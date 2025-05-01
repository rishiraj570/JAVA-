package folders;

public class ShapeAreaCalculator {


    // Method to calculate the area of a rectangle
    public double calculateArea(double length, double width) {
        return length * width;
    }

    // Method to calculate the area of a square
    public double calculateArea(double side) {
        return side * side;
    }

    // Method to calculate the area of a circle
    public double calculateArea(double radius, boolean isCircle) {
        return Math.PI * radius * radius; // Use 'isCircle' to differentiate
    }

    // Method to calculate the area of a triangle
    public double calculateArea(double base, double height, boolean isTriangle) {
        return 0.5 * base * height; // Use 'isTriangle' to differentiate
    }

    public static void main(String[] args) {
        ShapeAreaCalculator calculator = new ShapeAreaCalculator();

        // Test cases for different shapes
        System.out.println("Area of Rectangle: " + calculator.calculateArea(10, 5));
        System.out.println("Area of Square: " + calculator.calculateArea(4));
        System.out.println("Area of Circle: " + calculator.calculateArea(7, true));
        System.out.println("Area of Triangle: " + calculator.calculateArea(6, 8, true));
    }
}
