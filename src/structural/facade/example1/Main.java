package structural.facade.example1;

public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();

        facade.blueCircle();
        facade.redCircle();

        facade.blueSquare();
        facade.redSquare();

        facade.blueTriangle();
        facade.redTriangle();
    }
}
