
package experiment3;

public class Student {
    String name;
    int age;

    // Default constructor
    public Student() {
        this.name = "Tanishq ";
        this.age = 19;
    }

    // Parameterized constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display student details
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        // Creating an object using the default constructor
        Student student1 = new Student();
        student1.display();

        // Creating an object using the parameterized constructor
        Student student2 = new Student("RishiRaj Singh", 20);
        student2.display();
    }
}
