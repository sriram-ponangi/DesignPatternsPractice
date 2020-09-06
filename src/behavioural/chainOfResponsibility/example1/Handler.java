package behavioural.chainOfResponsibility.example1;

public abstract class Handler {
    private Handler nextHandler;

    public abstract void execute(Request request);

    public void next(Request request){
//        System.out.println("In next " + nextHandler);
        execute(request);
        if (nextHandler != null) {
            nextHandler.next(request);
        }
    }

    public final void setNextHandler(Handler nextHandler) {
//        System.out.println(nextHandler);
        this.nextHandler = nextHandler;
    }
}
