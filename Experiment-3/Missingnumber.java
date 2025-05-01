package experiment2;

public class Missingnumber {

    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 2, 4};
        int n = arr.length + 1; // Total numbers should be N (1 to N)
        int missingNumber = findMissingNumber(arr, n);

        System.out.println("Missing number: " + missingNumber);
    }

    public static int findMissingNumber(int[] arr, int n) {
        // Calculate the sum of numbers from 1 to N using the formula
        int totalSum = n * (n + 1) / 2;

        // Calculate the sum of elements in the array
        int arraySum = 0;
        for (int num : arr) {
            arraySum += num;
        }

        // The missing number is the difference
        return totalSum - arraySum;
    }
}

//call arr.lenghth
//forgot array sum to 0
//arraysum-total sum