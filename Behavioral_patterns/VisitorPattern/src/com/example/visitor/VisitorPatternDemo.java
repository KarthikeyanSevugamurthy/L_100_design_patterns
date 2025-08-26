public class VisitorPatternDemo {
    public static void main(String[] args) {
        Item[] items = {
            new Food(100),
            new Electronics(2000),
            new Medicine(500)
        };

        TaxVisitor taxCalculator = new TaxCalculator();

        for (Item item : items) {
            item.accept(taxCalculator);
        }
    }
}