package experiment9;
import java.io.*;

public class StudentFileReader {
  public static void main(String[] args) {
      try (FileReader reader = new FileReader("student.txt"); BufferedReader br = new BufferedReader(reader)) {
          String line;
          while ((line = br.readLine()) != null) {
              System.out.println(line);
          }
      } catch (FileNotFoundException e) {
          System.out.println("Error: student.txt file not found.");
      } catch (IOException e) {
          System.out.println("Error: Unable to read the file.");
      } finally {
          System.out.println("File operation attempted.");
      }
  }
}
