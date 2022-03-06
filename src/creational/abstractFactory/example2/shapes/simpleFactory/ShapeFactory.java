package creational.abstractFactory.example2.shapes.simpleFactory;


import creational.abstractFactory.example2.shapes.Shape;

public interface ShapeFactory {
    Shape createCircle();
    Shape createSquare();
}
