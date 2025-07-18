package pizza;

import topping.Topping;

public abstract class Pizza {
    protected Topping topping;

    public Pizza(Topping topping) {
        this.topping = topping;
    }

    public abstract void prepare();
}
