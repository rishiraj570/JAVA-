

public class B extends A { // Inheriting class A to access protected methods
    public static void main(String[] args) {
        A obj = new A();

        obj.publicMethod(); // ✅ Accessible: Public method

        // obj.protectedMethod(); // ❌ Not Accessible: Protected method (only accessible via inheritance)
        // obj.defaultMethod();   // ❌ Not Accessible: Default method (not accessible outside package)
        // obj.privateMethod();   // ❌ Not Accessible: Private method (not accessible outside class)

        obj.accessPrivateMethod(); // ✅ Indirectly accessing private method through public method

        // Using inheritance to access protected method
        B obj2 = new B();
        obj2.protectedMethod(); // ✅ Accessible via inheritance
    }
}
