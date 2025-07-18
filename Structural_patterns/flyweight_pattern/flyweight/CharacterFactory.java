package flyweight;

import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
    private final Map<String, Character> characters = new HashMap<>();

    public Character getCharacter(char symbol, String fontStyle) {
        String key = symbol + "-" + fontStyle;
        if (!characters.containsKey(key)) {
            characters.put(key, new ConcreteCharacter(symbol, fontStyle));
        }
        return characters.get(key);
    }
}
