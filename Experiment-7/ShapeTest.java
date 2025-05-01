abstract class Shape {
    abstract void calculateArea(); //Declares an abstract method calculateArea() without implementation.

}

class Rectangle extends Shape {
    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void calculateArea() {
        double area = length * width;
        System.out.println("Rectangle Area: " + area);
    }
}

class Circle extends Shape {
    private double radius;
//constructor initialize
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Circle Area: " + area);
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 10);
        Shape circle = new Circle(7);
        
        rectangle.calculateArea();
        circle.calculateArea();
    }
}
