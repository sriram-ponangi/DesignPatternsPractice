package behavioural.chainOfResponsibility.example1;

public class ThirdHandler extends Handler {
    @Override
    public void execute(Request request) {
//        System.out.println("In third execute");
        if(request.getUseHandler().equalsIgnoreCase("third")){
            System.out.println( request.getMessage() +" " + "ThirdHandler executed...\n" );
        }
    }

}
