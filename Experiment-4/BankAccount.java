
package experiment3;

public class BankAccount {
    private double balance; // Private variable to store account balance

    // Constructor to initialize balance
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Public method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Protected method to withdraw money
    protected void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    // Default-access method to check balance
    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0); // Creating an object with initial balance

        account.deposit(500);       // Accessible (Public)
        account.checkBalance();     // Accessible (Default access)

        account.withdraw(300);      // Accessible inside the class (Protected)
        account.checkBalance();     // Accessible (Default access)

        // account.balance = 2000;  // Not accessible (Private)
    }
}
//trying to Access balance Directly 
//Calling withdraw() from Another Class in a Different Package


