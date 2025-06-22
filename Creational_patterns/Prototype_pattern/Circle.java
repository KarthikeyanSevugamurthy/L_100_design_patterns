package Prototype_pattern;

public class Circle extends Shape {
    int radius;

    public Circle(String color, int x, int y, int radius) {
        super(color, x, y);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle -> color: " + color + ", position: (" + x + "," + y + "), radius: " + radius);
    }
}
