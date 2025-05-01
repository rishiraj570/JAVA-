package experiment9;
import java.io.*;

class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    String name;
    int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Display method
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class PersonSerialization {
    public static void main(String[] args) {
        String filename = "person.txt";

        // Serialize the object
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            Person p1 = new Person("RishiRaj Singh", 20);
            out.writeObject(p1);
            System.out.println("Object Serialized Successfully.");
        } catch (IOException e) {
            System.out.println("Serialization Error: " + e.getMessage());
        }

        // Deserialize the object
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            Person p2 = (Person) in.readObject();
            System.out.println("Deserialized Object:");
            p2.display();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Deserialization Error: " + e.getMessage());
        }
    }
}
