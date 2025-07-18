package stream;

public class EncryptedStream extends InputStreamDecorator {
    public EncryptedStream(InputStream stream) {
        super(stream);
    }

    public void read() {
        super.read();
        System.out.println("Decrypting data after reading.");
    }
}
