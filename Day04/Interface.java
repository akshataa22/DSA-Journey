package Day04;

interface Printable {
    void print();
}

class Report implements Printable {
    public void print() {
        System.out.println("Printing.");
    }
}

interface Shape {
    double area();
}

class Circle implements Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return 3.142 * radius * radius;
    }
}

abstract class Shapes {
    abstract double area();

    void describe() {
        System.out.println("I am a shape");
    }
}

class Circles extends Shapes {
    double radius;

    Circles(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

public class Interface {
    public static void main(String[] args) {
        Printable pr = new Report();

        pr.print();

        Shape s = new Circle(5);
        System.out.println("Area: " + s.area());

        Shapes s1 = new Circles(5);
        System.out.println("Area: " + s1.area());
    }
}
