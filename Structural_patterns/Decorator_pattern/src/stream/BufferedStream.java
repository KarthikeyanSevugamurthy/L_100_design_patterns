package stream;

public class BufferedStream extends InputStreamDecorator {
    public BufferedStream(InputStream stream) {
        super(stream);
    }

    public void read() {
        super.read();
        System.out.println("Buffered reading enabled.");
    }
}
