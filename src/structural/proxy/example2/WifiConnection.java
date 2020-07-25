package structural.proxy.example2;

public class WifiConnection implements Internet {
    @Override
    public void connect() {
        System.out.println("Connecting internet");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting internet");
    }
}
