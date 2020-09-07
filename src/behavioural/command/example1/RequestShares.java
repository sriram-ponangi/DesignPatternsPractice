package behavioural.command.example1;

public class RequestShares {
    private String companyId;
    private int quantity;

    public RequestShares(String companyId, int quantity) {
        this.companyId = companyId;
        this.quantity = quantity;
    }

    public void buy(){
        System.out.println("Buying "+quantity+" shares of "+companyId+" company.");
    }
    public void sell(){
        System.out.println("Selling "+quantity+" shares of "+companyId+" company.");
    }
}
