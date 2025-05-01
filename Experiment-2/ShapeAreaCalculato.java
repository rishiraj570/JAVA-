package experiment2;
import java.util.Scanner;

public class ShapeAreaCalculato {

    // Area of Rectangle
    public static double area(double length, double width) {
        return length * width;
    }

    // Area of Square
    public static double area(double side) {
        return side * side;
    }

    // Area of Circle
    public static double area(float radius) {
        return Math.PI * radius * radius;
    }

    // Area of Triangle
    public static double area(double base, double height, boolean isTriangle) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose shape: 1. Rectangle 2. Square 3. Circle 4. Triangle");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter length and width: ");
                double length = scanner.nextDouble();
                double width = scanner.nextDouble();
                System.out.println("Area of Rectangle: " + area(length, width));
                break;
            case 2:
                System.out.print("Enter side length: ");
                double side = scanner.nextDouble();
                System.out.println("Area of Square: " + area(side));
                break;
            case 3:
                System.out.print("Enter radius: ");
                float radius = scanner.nextFloat();
                System.out.println("Area of Circle: " + area(radius));
                break;
            case 4:
                System.out.print("Enter base and height: ");
                double base = scanner.nextDouble();
                double height = scanner.nextDouble();
                System.out.println("Area of Triangle: " + area(base, height, true));
                break;
            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}
