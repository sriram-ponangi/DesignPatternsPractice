package creational.abstractFactory.example2.shapes.simpleFactory;


import creational.abstractFactory.example2.shapes.Circle;
import creational.abstractFactory.example2.shapes.Square;
import creational.abstractFactory.example2.shapes.Shape;


public class ShapeFactoryImpl implements ShapeFactory {
    public Shape createCircle(){
        return new Circle();
    }
    public Shape createSquare() {
        return new Square();
    }
}
