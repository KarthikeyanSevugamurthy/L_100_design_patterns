package Prototype_pattern;

public class Rectangle extends Shape {
    int width, height;

    public Rectangle(String color, int x, int y, int width, int height) {
        super(color, x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle -> color: " + color + ", position: (" + x + "," + y + "), size: " + width + "x" + height);
    }
}
