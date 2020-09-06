package behavioural.chainOfResponsibility.example1;

public class SecondHandler extends Handler {
    @Override
    public void execute(Request request) {
//        System.out.println("In second execute");
        if(request.getUseHandler().equalsIgnoreCase("second")){
            System.out.println( request.getMessage() +" " + "SecondHandler executed...\n" );
        }
    }
}
