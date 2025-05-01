package experiment3;

public class Course {
    String courseName; // Class attribute for course name
    String courseCode; // Class attribute for course code

    // Constructor to initialize course details
    public Course(String courseName, String courseCode) {
        this.courseName = courseName; // Using "this" to refer to class attribute
        this.courseCode = courseCode; // Using "this" to refer to class attribute
    }

    // Method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Code: " + courseCode);
    }

    public static void main(String[] args) {
        // Creating an object of the Course class
        Course course1 = new Course("Object Oriented Programming", "IT201");

        // Displaying course details
        course1.displayCourseDetails();
    }
}
