package extrinsic;

import flyweight.Character;

public class CharacterContext {
    private final Character character;
    private final int x, y;

    public CharacterContext(Character character, int x, int y) {
        this.character = character;
        this.x = x;
        this.y = y;
    }

    public void display() {
        character.display(x, y);
    }
}
