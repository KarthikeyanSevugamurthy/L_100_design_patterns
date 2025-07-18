package client;

import extrinsic.CharacterContext;
import flyweight.Character;
import flyweight.CharacterFactory;

import java.util.ArrayList;
import java.util.List;

public class TextEditorClient {
    public static void main(String[] args) {
        CharacterFactory factory = new CharacterFactory();
        List<CharacterContext> document = new ArrayList<>();

        // Simulate typing: "hello"
        String text = "hello";
        int x = 0;
        for (char c : text.toCharArray()) {
            Character character = factory.getCharacter(c, "Arial");
            document.add(new CharacterContext(character, x++, 1));
        }

        for (CharacterContext context : document) {
            context.display();
        }
    }
}
