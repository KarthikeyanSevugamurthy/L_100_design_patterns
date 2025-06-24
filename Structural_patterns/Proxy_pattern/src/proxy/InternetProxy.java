package proxy;

import real.RealInternet;
import service.InternetAccess;

import java.util.Arrays;
import java.util.List;

public class InternetProxy implements InternetAccess {

    private final InternetAccess realInternet = new RealInternet();
    private final List<String> blockedSites = Arrays.asList("facebook.com", "instagram.com", "tiktok.com");

    @Override
    public void connectTo(String site) {
        if (blockedSites.contains(site.toLowerCase())) {
            System.out.println("Access Denied to: " + site);
        } else {
            realInternet.connectTo(site);
        }
    }
}
