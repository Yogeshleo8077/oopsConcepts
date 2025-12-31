abstract class Shape {
    abstract void draw(); // abstract method

    void info() {
        System.out.println("This is shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}

class Triangle extends Shape {
    void draw() {
        System.out.println("Drawing Traingle");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Shape c = new Circle();
        Shape t = new Triangle();
        c.draw();
        c.info();

        t.draw();
        t.info();

    }
}
