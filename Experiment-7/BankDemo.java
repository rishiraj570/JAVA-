interface Bank {
	//Declares two methods:
    void deposit(double amount);
    void withdraw(double amount);
}
//Class Account (Implements Bank)
class Account implements Bank {
    private double balance;
//Initializes the account with a starting balance.

    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}
//(Main Method Execution)
public class BankDemo {
    public static void main(String[] args) {
        Account myAccount = new Account(1000);
        myAccount.deposit(500);
        myAccount.withdraw(200);
        myAccount.withdraw(1500);
        myAccount.displayBalance();
    }
}
