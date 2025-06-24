import proxy.InternetProxy;
import service.InternetAccess;

public class Main {
    public static void main(String[] args) {
        InternetAccess internet = new InternetProxy();

        internet.connectTo("google.com");
        internet.connectTo("facebook.com");
        internet.connectTo("tiktok.com");
        internet.connectTo("wikipedia.org");
    }
}
