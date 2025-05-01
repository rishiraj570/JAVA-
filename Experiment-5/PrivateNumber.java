
package experiment4;

class SuperClass {
    private int privateNumber = 42;

    public int getPrivateNumber() {
        return privateNumber;
    }
}

class SubClass extends SuperClass {
    public void display() {
        // Attempting to access privateNumber directly will cause an error
        // System.out.println("Private Number: " + privateNumber); // Compilation Error
        
        // Accessing private member through a public method is allowed
        System.out.println("Private Number (via getter): " + getPrivateNumber());
    }
}

public class PrivateNumber {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.display();
    }
}
