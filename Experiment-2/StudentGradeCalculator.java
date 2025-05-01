

public class StudentGradeCalculator {
    public static String calculateGrade(double[] marks) {
        double average = (marks[0] + marks[1] + marks[2]) / 3;
        if (average >= 90) {
            return "Grade A";
        } else if (average >= 75) {
            return "Grade B";
        } else if (average >= 50) {
            return "Grade C";
        } else {
            return "Grade F";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Initialize Scanner
        double[] marks = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextDouble();
        }
        scanner.close();

        String grade = calculateGrade(marks);
        System.out.println("Final Grade: " + grade);
    }
}
