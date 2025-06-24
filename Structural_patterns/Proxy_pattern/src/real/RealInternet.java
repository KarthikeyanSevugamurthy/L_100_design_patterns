package real;

import service.InternetAccess;

public class RealInternet implements InternetAccess {
    @Override
    public void connectTo(String site) {
        System.out.println("Connecting to " + site);
    }
}
