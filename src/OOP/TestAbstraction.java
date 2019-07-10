package OOP;

abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw() { System.out.println("drawing a circle...");}
}

class Rectagle extends Shape {
    void draw() { System.out.println("drawing a recangle...");}
}

public class TestAbstraction {
    public static void main (String[] args) {
        Shape s = new Circle();
        s.draw();
        Shape s1 = new Rectagle();
        s1.draw();
    }
}
