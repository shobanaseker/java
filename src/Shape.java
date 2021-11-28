abstract class Shape {
    abstract void draw();
}

class Triangle extends Shape {
    void draw() {
        System.out.println("drawing triangle");
    }
}

class Sphere extends Shape {
    void draw() {
        System.out.println("drawing sphere");
    }
}

class Abstraction {
    public static void main(String[] args) {
        Shape s = new Triangle();
        Shape se = new Sphere();
        s.draw();
        se.draw();
    }
}
