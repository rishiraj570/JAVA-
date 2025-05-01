class Circle extends MathConstants {
    // Method to calculate area of a circle
    void calculateArea(double radius) {
        double area = PI * radius * radius;
        System.out.println("Area of Circle with radius " + radius + ": " + area);
    }

    // Attempting to override the final method (will cause an error)
    /*
    @Override
    void displayPI() {
        System.out.println("Trying to override final method!");
    }
    */
}
