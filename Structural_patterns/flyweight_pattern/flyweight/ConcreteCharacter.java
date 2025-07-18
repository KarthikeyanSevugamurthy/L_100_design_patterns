package flyweight;

public class ConcreteCharacter implements Character {
    private final char symbol;
    private final String fontStyle;

    public ConcreteCharacter(char symbol, String fontStyle) {
        this.symbol = symbol;
        this.fontStyle = fontStyle;
    }

    @Override
    public void display(int x, int y) {
        System.out.println("Character: '" + symbol + "' with font '" + fontStyle + "' at position (" + x + ", " + y + ")");
    }
}
