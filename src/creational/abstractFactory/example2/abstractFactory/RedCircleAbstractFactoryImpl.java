package creational.abstractFactory.example2.abstractFactory;

import creational.abstractFactory.example2.colours.Colour;
import creational.abstractFactory.example2.colours.Red;
import creational.abstractFactory.example2.colours.simpleFactory.ColourFactory;
import creational.abstractFactory.example2.shapes.Circle;
import creational.abstractFactory.example2.shapes.Shape;
import creational.abstractFactory.example2.shapes.simpleFactory.ShapeFactory;

public class RedCircleAbstractFactoryImpl extends ColourfulShapeAbstractFactory {

    public RedCircleAbstractFactoryImpl(
            ColourFactory colourFactory,
            ShapeFactory shapeFactory) {
        super(colourFactory, shapeFactory);
    }

    @Override
    public Shape createShape() {
        return shapeFactory.createCircle();
    }

    @Override
    public Colour createColour() {
        return colourFactory.createRed();
    }
}

