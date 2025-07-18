import stream.*;

public class Main {
    public static void main(String[] args) {
        InputStream stream = new FileStream();

        System.out.println("\nRaw File:");
        stream.read();

        System.out.println("\nBuffered File:");
        InputStream buffered = new BufferedStream(stream);
        buffered.read();

        System.out.println("\nBuffered + Encrypted File:");
        InputStream full = new EncryptedStream(new BufferedStream(stream));
        full.read();
    }
}
