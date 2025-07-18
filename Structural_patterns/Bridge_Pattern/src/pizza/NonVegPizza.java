package pizza;

import topping.Topping;

public class NonVegPizza extends Pizza {
    public NonVegPizza(Topping topping) {
        super(topping);
    }

    public void prepare() {
        System.out.println("Preparing Non-Veg Pizza with " + topping.getTopping());
    }
}
