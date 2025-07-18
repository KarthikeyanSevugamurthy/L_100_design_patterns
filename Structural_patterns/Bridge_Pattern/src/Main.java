import pizza.NonVegPizza;
import pizza.Pizza;
import pizza.VegPizza;
import topping.Cheese;
import topping.Chicken;

public class Main {
    public static void main(String[] args) {
        Pizza vegCheese = new VegPizza(new Cheese());
        Pizza nonVegChicken = new NonVegPizza(new Chicken());

        vegCheese.prepare();     
        nonVegChicken.prepare();
    }
}
