
public class Main1 {
    public static void main(String[] args) {
        Circle circle = new Circle();

        // Displaying PI using final method
        circle.displayPI();

        // Calculating and displaying area of a circle
        circle.calculateArea(5);

        // Attempting to modify PI (will cause an error)
        // circle.PI = 3.14; // ❌ Compilation error: Cannot assign a value to final variable 'PI'
    }
}
