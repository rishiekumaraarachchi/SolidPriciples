package LiskovSubstitution;

// Base class violating LSP
class Bird {
    public void fly() {
        System.out.println("Flying...");
    }
}

// Subclass violating LSP by changing the behavior
class Penguin extends Bird {
    // Penguins can't fly, but this method contradicts the behavior of the base class
    @Override
    public void fly() {
        System.out.println("Penguins are soaring through the skies!");
    }
}

// Example usage
public class Demo {
    public static void main(String[] args) {
           Bird bird = new Bird();
            Penguin penguin = new Penguin();
            bird.fly();
            penguin.fly();
        }
}

