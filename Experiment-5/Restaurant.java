package experiment4;

// Base class Chef
class Chef {
    void makeSpecialDish() {
        System.out.println("The chef is making a special dish.");
    }
}

// ItalianChef subclass
class ItalianChef extends Chef {
    @Override
    void makeSpecialDish() {
        System.out.println("Making pasta.");
    }
}

// ChineseChef subclass
class ChineseChef extends Chef {
    @Override
    void makeSpecialDish() {
        System.out.println("Making dumplings.");
    }
}

// MexicanChef subclass
class MexicanChef extends Chef {
    @Override
    void makeSpecialDish() {
        System.out.println("Making tacos.");
    }
}

// Main class (Must be the same as filename: Restaurant.java)
public class Restaurant {
    public static void main(String[] args) {
        // Array of Chef references holding different Chef types
        Chef[] chefs = {
            new ItalianChef(),
            new ChineseChef(),
            new MexicanChef()
        };

        // Loop to call makeSpecialDish() on each chef
        for (Chef chef : chefs) {
            chef.makeSpecialDish(); // Calls the overridden method in respective subclass
        }
    }
}
