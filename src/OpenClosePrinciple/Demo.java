package OpenClosePrinciple;

//public class Demo {
//    public static void main(String[] args) {
//        Shape rectangle = new Rectangle(5, 10);
//        Shape square = new Square(5);
//        System.out.println(rectangle.calculateArea());
//        System.out.println(square.calculateArea());
//
//    }
//}
//
//// Interface defining a shape's contract
//interface Shape {
//    double calculateArea();
//}
//
//// Class adhering to OCP by implementing the Shape interface
//class Rectangle implements Shape {
//    private double width;
//    private double height;
//
//    public Rectangle(double width, double height) {
//        this.width = width;
//        this.height = height;
//    }
//
//    @Override
//    public double calculateArea() {
//        return width * height;
//    }
//}
//
//// New class adhering to OCP by implementing the Shape interface
//class Square implements Shape {
//    private double side;
//
//    public Square(double side) {
//        this.side = side;
//    }
//
//    @Override
//    public double calculateArea() {
//        return side * side;
//    }
//}

// Class violating OCP
class Rectangle {
    public double width;
    public double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        return width * height;
    }
}

// Extension violating OCP by modifying existing class
class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }

    // Overrides the calculateArea method to ensure a square's area is calculated correctly
    @Override
    public double calculateArea() {
        return super.calculateArea();
    }
}

public class Demo {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        Rectangle square = new Square(5);
        System.out.println(rectangle.calculateArea());
        System.out.println(square.calculateArea());

    }
}