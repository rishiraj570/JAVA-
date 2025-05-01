package experiment3;

public class University {
    static String universityName = "UPES University"; // Static variable (shared by all instances)
    String studentName = "rishi"; // Non-static variable (unique for each instance)

    // Constructor to initialize student name
    public University(String studentName) {
        this.studentName = studentName;
    }

    // Static method to display the university name
    static void displayUniversityName() {
        System.out.println("University Name: " + universityName);
    }

    // Non-static method to display student details
    void displayStudent() {
        System.out.println("Student Name: " + studentName);
    }

    public static void main(String[] args) {
        // Calling static method using class name
        University.displayUniversityName();

        // Creating student objects
        University student1 = new University("RishiRaj Singh");
        University student2 = new University("JASMAN SINGH");

        // Displaying student details
        student1.displayStudent();
        student2.displayStudent();
    }
}

