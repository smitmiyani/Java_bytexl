abstract class shape {
    abstract public void draw();
}

class Circle extends shape {

    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle extends shape {

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

public class Main {
    public static void main(String[] args) {
        shape shape = new Circle();
        shape.draw(); 

        shape = new Rectangle();
        shape.draw(); 
    }
}
