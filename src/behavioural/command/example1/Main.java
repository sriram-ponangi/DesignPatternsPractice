package behavioural.command.example1;

public class Main {
    public static void main(String[] args) {
        RequestShares google = new RequestShares("Google", 100);
        BuySharesCommand buyGoogleShares = new BuySharesCommand(google);
        SellSharesCommand sellGoogleShares = new SellSharesCommand(google);

        StockBroker broker = new StockBroker();
        broker.addNewOrder(buyGoogleShares);
        broker.addNewOrder(sellGoogleShares);
        broker.placeAllOrders();

    }
}
