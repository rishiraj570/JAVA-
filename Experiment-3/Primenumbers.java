package experiment2;

public class Primenumbers {

    public static void main(String[] args) {
        int count = 0;
        
        System.out.println("Prime numbers between 1 and 1000:");
        
        for (int i = 2; i <= 1000; i++) { // Corrected here
            if (isPrime(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        
        System.out.println("\nTotal number of prime numbers between 1 and 1000: " + count);
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
//not use capital letter
//use i=1 in for loop
//not use num<=1
