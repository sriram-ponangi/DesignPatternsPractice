package behavioural.command.example1;

public class BuySharesCommand implements OrderCommand {
    private RequestShares shares;

    public BuySharesCommand(RequestShares shares) {
        this.shares = shares;
    }

    @Override
    public void execute() {
        shares.buy();
    }
}
