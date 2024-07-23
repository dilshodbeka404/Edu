package algoritms;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rect = new Rectangle();
        Triangle triangle = new Triangle();
        circle.draw();
        rect.draw();
        triangle.draw();
    }

}

abstract class Sheap {
    protected abstract void draw();
}

class Circle extends Sheap {
    @Override
    protected void draw() {
        System.out.println("Draw circle");
    }
}

class Rectangle extends Sheap {

    @Override
    protected void draw() {
        System.out.println("Draw rectangle");
    }
}

class Triangle extends Sheap {
    @Override
    protected void draw() {
        System.out.println("Draw triangle");
    }
}

