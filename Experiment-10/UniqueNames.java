package experiment9_2;

import java.util.HashSet;

public class UniqueNames {
    public static void main(String[] args) {
        String[] names = {"Aman", "Varchasv", "Sourabh", "Varchasv", "Aman"};
        HashSet<String> uniqueNames = new HashSet<>();

        for (String name : names) {
            uniqueNames.add(name);
        }

        // Check if a specific name exists
        String searchName = "Sourabh";
        if (uniqueNames.contains(searchName)) {
            System.out.println(searchName + " is in the set.");
        }

        // Print unique names
        System.out.println("Unique names:");
        for (String name : uniqueNames) {
            System.out.println(name);
        }
    }
}
