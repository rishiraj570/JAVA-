package folders;

import java.util.Scanner;

public class bill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number of units consumed
        System.out.print("Enter the number of units consumed: ");
        int units = scanner.nextInt();
        double bill = 0;

        // Calculate the electricity bill based on unit slabs
        if (units <= 100) {
            bill = units * 5;
        } else if (units <= 200) {
            bill = (100 * 5) + ((units - 100) * 7);
        } else if (units <= 300) {
            bill = (100 * 5) + (100 * 7) + ((units - 200) * 10);
        } else {
            bill = (100 * 5) + (100 * 7) + (100 * 10) + ((units - 300) * 15);
        }

        // Output: Total electricity bill
        System.out.println("The total electricity bill is: Rs " + bill);

        scanner.close();
    }
}
