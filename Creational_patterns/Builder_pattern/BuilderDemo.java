package Builder_pattern;

public class BuilderDemo {
    public static void main(String[] args) {
        Pizza pizza1 = new PizzaBuilder()
                .size("Large")
                .crust("Thin")
                .addTopping("Pepperoni")
                .addTopping("Mushrooms")
                .extraCheese(true)
                .build();

        pizza1.display();

        Pizza pizza2 = new PizzaBuilder()
                .size("Medium")
                .crust("Stuffed")
                .addTopping("Paneer")
                .extraCheese(false)
                .build();

        pizza2.display();
    }
}
