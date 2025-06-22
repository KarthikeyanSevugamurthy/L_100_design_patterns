package Prototype_pattern;

public class PrototypeDemo {
    public static void main(String[] args) {
        Circle original = new Circle("Red", 10, 20, 5);
        original.draw();

        Circle cloned = (Circle) original.clone();
        cloned.x = 50;
        cloned.color = "Blue";
        cloned.draw();

        Rectangle rect = new Rectangle("Green", 0, 0, 30, 40);
        rect.draw();

        Rectangle rectCopy = (Rectangle) rect.clone();
        rectCopy.x = 100;
        rectCopy.color = "Yellow";
        rectCopy.draw();
    }
}
