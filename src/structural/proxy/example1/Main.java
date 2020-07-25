package structural.proxy.example1;

public class Main {
    public static void main(String[] args) {
        ExpensiveObject expensiveObject = new ExpensiveObjectProxy();
        expensiveObject.process();

        expensiveObject = new ExpensiveObjectProxy();
        expensiveObject.process();
    }
}
