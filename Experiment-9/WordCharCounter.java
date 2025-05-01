package experiment9;
import java.io.*;
import java.util.Scanner;

public class WordCharCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String fileName = scanner.nextLine();

        // Print the absolute path to verify
        File file = new File(fileName);
        System.out.println("Looking for file at: " + file.getAbsolutePath());

        try (FileReader reader = new FileReader(file)) {
            int charCount = 0;
            int wordCount = 0;
            boolean inWord = false;
            int ch;
            
            while ((ch = reader.read()) != -1) {
                if (!Character.isWhitespace(ch)) {
                    charCount++;
                    if (!inWord) {
                        wordCount++;
                        inWord = true;
                    }
                } else {
                    inWord = false;
                }
            }

            System.out.println("Total Words: " + wordCount);
            System.out.println("Total Characters (excluding spaces): " + charCount);
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        } catch (IOException e) {
            System.out.println("Error: Unable to read the file.");
        } finally {
            System.out.println("File operation attempted.");
        }

        scanner.close();
    }
}
