package experiment4;

// Base class
class Player {
    String name;
    int age;
    String position;

    public Player(String name, int age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }

    void play() {
        System.out.println(name + " is playing in " + position + " position.");
    }

    void train() {
        System.out.println(name + " is training.");
    }
}

// Derived class for Cricket Players
class Cricket_Player extends Player {
    public Cricket_Player(String name, int age, String position) {
        super(name, age, position);
    }

    @Override
    void play() {
        System.out.println(name + " is batting or bowling as a " + position + " in Cricket.");
    }
}

// Derived class for Football Players
class Football_Player extends Player {
    public Football_Player(String name, int age, String position) {
        super(name, age, position);
    }

    @Override
    void play() {
        System.out.println(name + " is playing as a " + position + " in Football.");
    }
}

// Derived class for Hockey Players
class Hockey_Player extends Player {
    public Hockey_Player(String name, int age, String position) {
        super(name, age, position);
    }

    @Override
    void play() {
        System.out.println(name + " is playing as a " + position + " in Hockey.");
    }
}

// Main class to test the implementation
public class Sports {
    public static void main(String[] args) {
        Cricket_Player cricketPlayer = new Cricket_Player("Virat Kohli", 35, "Batsman");
        Football_Player footballPlayer = new Football_Player("Lionel Messi", 36, "Forward");
        Hockey_Player hockeyPlayer = new Hockey_Player("Manpreet Singh", 32, "Midfielder");

        cricketPlayer.play();
        cricketPlayer.train();

        footballPlayer.play();
        footballPlayer.train();

        hockeyPlayer.play();
        hockeyPlayer.train();
    }
}
