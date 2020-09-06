package behavioural.chainOfResponsibility.example1;

public class FirstHandler extends Handler {
    @Override
    public void execute(Request request) {
//        System.out.println("In first execute");
        if(request.getUseHandler().equalsIgnoreCase("first")){
            System.out.println( request.getMessage() +" " + "FirstHandler executed...\n" );
        }
    }
}
