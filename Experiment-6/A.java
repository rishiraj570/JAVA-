
public class A {
    public void publicMethod() {
        System.out.println("Public Method: Accessible everywhere.");
    }

    protected void protectedMethod() {
        System.out.println("Protected Method: Accessible within the same package or through inheritance.");
    }

    void defaultMethod() {
        System.out.println("Default Method: Accessible only within the same package.");
    }

    private void privateMethod() {
        System.out.println("Private Method: Accessible only within the same class.");
    }

    // Public method to access the private method within the same class
    public void accessPrivateMethod() {
        privateMethod();
    }
}
