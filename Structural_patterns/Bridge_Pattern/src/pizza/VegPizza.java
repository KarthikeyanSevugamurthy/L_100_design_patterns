package pizza;

import topping.Topping;

public class VegPizza extends Pizza {
    public VegPizza(Topping topping) {
        super(topping);
    }

    public void prepare() {
        System.out.println("Preparing Veg Pizza with " + topping.getTopping());
    }
}
