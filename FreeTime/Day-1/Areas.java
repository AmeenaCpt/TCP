class Shape {
    public void area() {
        System.out.println("Area cannot be determined");
    }
}

// Circle class
class Circle extends Shape {
    private double radius;

    Circle(double r) {
        this.radius = r;
    }

    @Override
    public void area() {
        double result = Math.PI * radius * radius;
        System.out.println("Area of Circle = " + result);
    }
}

// Rectangle class
class Rectangle extends Shape {
    private double length, breadth;

    Rectangle(double l, double b) {
        this.length = l;
        this.breadth = b;
    }

    @Override
    public void area() {
        double result = length * breadth;
        System.out.println("Area of Rectangle = " + result);
    }
}

// Main class
public class Areas {
    public static void main(String[] args) {
        Shape s;   // reference of base class

        // Circle object
        s = new Circle(5);
        s.area();  // Calls Circle's area()

        // Rectangle object
        s = new Rectangle(10, 20);
        s.area();  // Calls Rectangle's area()
    }
}
