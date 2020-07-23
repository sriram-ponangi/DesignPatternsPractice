package structural.bridge.example1;


public class Main {
    public static void main(String[] args) {
        Color red = new Red();
        Color blue = new Blue();

        Shape redCircle = new Circle(red);
        Shape redSquare = new Square(red);
        Shape redTriangle = new Triangle(red);

        Shape blueCircle = new Circle(blue);
        Shape blueSquare = new Square(blue);
        Shape blueTriangle = new Triangle(blue);

        redCircle.draw();
        redSquare.draw();
        redTriangle.draw();
        System.out.println("\n");
        blueCircle.draw();
        blueSquare.draw();
        blueTriangle.draw();

    }


}
