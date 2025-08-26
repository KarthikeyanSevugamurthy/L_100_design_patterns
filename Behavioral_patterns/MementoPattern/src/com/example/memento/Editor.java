class Editor {
    private String content;

    public void setContent(String content) {
        this.content = content;
        System.out.println("Editing: " + content);
    }

    public String getContent() {
        return content;
    }

    public Memento save() {
        return new Memento(content);
    }

    public void restore(Memento memento) {
        this.content = memento.getState(); 
        System.out.println("Restored to: " + content);
    }
}