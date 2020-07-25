package structural.facade.example1;

import structural.facade.example1.colours.*;
import structural.facade.example1.shapes.*;

public class Facade {
    public void redCircle(){
        Colour red = new Red();
        Shape redCircle = new Circle(red);
        redCircle.draw();
    }
    public void blueCircle(){
        Colour red = new Blue();
        Shape blueCircle = new Circle(red);
        blueCircle.draw();
    }

    public void redSquare(){
        Colour red = new Red();
        Shape redSquare = new Square(red);
        redSquare.draw();
    }
    public void blueSquare(){
        Colour red = new Blue();
        Shape redSquare = new Square(red);
        redSquare.draw();
    }

    public void redTriangle(){
        Colour red = new Red();
        Shape redTriangle = new Triangle(red);
        redTriangle.draw();
    }
    public void blueTriangle(){
        Colour red = new Blue();
        Shape redTriangle = new Triangle(red);
        redTriangle.draw();
    }
}
