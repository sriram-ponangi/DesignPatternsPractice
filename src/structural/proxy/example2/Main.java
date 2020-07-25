package structural.proxy.example2;

public class Main {
    public static void main(String[] args) {
        Internet access1 = new OfficeWifiProxy("B00100001");
        access1.connect();

        Internet access2 = new OfficeWifiProxy("");
        access2.connect();
    }
}
