package structural.bridge.example1;


import structural.bridge.example1.colours.Blue;
import structural.bridge.example1.colours.Colour;
import structural.bridge.example1.colours.Red;
import structural.bridge.example1.shapes.Circle;
import structural.bridge.example1.shapes.Shape;
import structural.bridge.example1.shapes.Square;
import structural.bridge.example1.shapes.Triangle;

public class Main {
    public static void main(String[] args) {
        Colour red = new Red();
        Colour blue = new Blue();

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
