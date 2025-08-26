public class MementoDemo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        History history = new History();

        editor.setContent("Drawing Circle");
        history.save(editor.save());

        editor.setContent("Drawing Square");
        history.save(editor.save());

        editor.setContent("Drawing Triangle");

        // Undo last action
        editor.restore(history.undo());  // Restores to "Drawing Square"
        editor.restore(history.undo());  // Restores to "Drawing Circle"
    }
}