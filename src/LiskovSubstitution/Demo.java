package LiskovSubstitution;

// Base interfaces adhering to LSP
interface FlyBird {
    void fly();
}

interface Bird {
    void walk();
}

// Subclass adhering to LSP
class Sparrow implements Bird, FlyBird {
    @Override
    public void walk() {
        System.out.println("Sparrow is walking...");
    }

    @Override
    public void fly() {
        System.out.println("Sparrow is flying...");
    }
}

// Subclass adhering to LSP
class Penguin implements Bird {
    @Override
    public void walk() {
        System.out.println("Penguin is walking!");
    }
}

// Example usage
public class Demo {
    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        sparrow.walk();
        sparrow.fly();

        Penguin penguin = new Penguin();
        penguin.walk();
    }
}
