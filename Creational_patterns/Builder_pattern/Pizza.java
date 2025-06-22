package Builder_pattern;
import java.util.List;

public class Pizza {
    String size;
    String crust;
    List<String> toppings;
    boolean extraCheese;

    public Pizza(String size, String crust, List<String> toppings, boolean extraCheese) {
        this.size = size;
        this.crust = crust;
        this.toppings = toppings;
        this.extraCheese = extraCheese;
    }

    public void display() {
        System.out.println("Pizza [Size: " + size + ", Crust: " + crust + ", Toppings: " + toppings + ", Extra Cheese: " + extraCheese + "]");
    }
}
