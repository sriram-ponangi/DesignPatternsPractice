package behavioural.command.example1;

public class SellSharesCommand implements OrderCommand {
    private RequestShares shares;

    public SellSharesCommand(RequestShares shares) {
        this.shares = shares;
    }

    @Override
    public void execute() {
        shares.sell();
    }
}
