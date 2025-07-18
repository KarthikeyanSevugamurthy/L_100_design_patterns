package stream;

public abstract class InputStreamDecorator implements InputStream {
    protected InputStream stream;

    public InputStreamDecorator(InputStream stream) {
        this.stream = stream;
    }

    public void read() {
        stream.read();
    }
}
