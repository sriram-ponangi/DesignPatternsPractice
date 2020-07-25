package structural.decorator.example1;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        ShapeDecorator redCircle = new RedColorShape(circle);

        Shape square = new Square();
        ShapeDecorator redSquare = new RedColorShape(square);

        redCircle.draw();
        redSquare.draw();
    }
}
