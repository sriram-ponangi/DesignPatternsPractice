package behavioural.chainOfResponsibility.example1;

public class Main {
    public static void main(String[] args) {
        Handler chainRootHandler = createChain();
        Request firstRequest = new Request("first", "Hello");
        chainRootHandler.next(firstRequest);

        Request secondRequest = new Request("second", "Hi");
        chainRootHandler.next(secondRequest);

        Request thirdRequest = new Request("third", "Greetings");
        chainRootHandler.next(thirdRequest);

        Request fourthRequest = new Request("fourth", "Ola");
        chainRootHandler.next(fourthRequest);
    }

    public static Handler createChain(){
        Handler firstHandler = new FirstHandler();
        Handler secondHandler = new SecondHandler();
        Handler thirdHandler = new ThirdHandler();

        firstHandler.setNextHandler(secondHandler);
        secondHandler.setNextHandler(thirdHandler);

        return firstHandler;
    }
}
