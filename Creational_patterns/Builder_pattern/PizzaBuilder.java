package Builder_pattern;
import java.util.ArrayList;
import java.util.List;

public class PizzaBuilder {
    private String size;
    private String crust;
    private List<String> toppings = new ArrayList<>();
    private boolean extraCheese;

    public PizzaBuilder size(String size) {
        this.size = size;
        return this;
    }

    public PizzaBuilder crust(String crust) {
        this.crust = crust;
        return this;
    }

    public PizzaBuilder addTopping(String topping) {
        toppings.add(topping);
        return this;
    }

    public PizzaBuilder extraCheese(boolean value) {
        this.extraCheese = value;
        return this;
    }

    public Pizza build() {
        return new Pizza(size, crust, toppings, extraCheese);
    }
}
