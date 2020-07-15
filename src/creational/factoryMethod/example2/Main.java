package creational.factoryMethod.example2;

public class Main {
    public static void main(String[] args) {
        System.out.println("FACTORY METHOD PATTERN: \n");
        DrawCircleOnCanvas circle = new DrawCircleOnCanvas();
        circle.sketch("Red");

        DrawSquareOnCanvas square = new DrawSquareOnCanvas();
        square.sketch("Red");
    }
}
