package experiment9;
import java.io.*;
import java.util.Scanner;

public class StudentFileWriter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter roll number: ");
        String rollNumber = scanner.nextLine();
        
        System.out.print("Enter grade: ");
        String grade = scanner.nextLine();
        
        String studentData = "Name: " + name + ", Roll Number: " + rollNumber + ", Grade: " + grade + "\n";
        
        try (FileWriter writer = new FileWriter("student.txt", true)) { // Append mode enabled
            writer.write(studentData);
            System.out.println("Student information saved successfully.");
        } catch (IOException e) {
            System.out.println("Error: Unable to write to file.");
        } finally {
            System.out.println("File operation attempted.");
        }
        
        scanner.close();
    }
}
