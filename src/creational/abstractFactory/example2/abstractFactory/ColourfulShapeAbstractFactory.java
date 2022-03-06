package creational.abstractFactory.example2.abstractFactory;

import creational.abstractFactory.example2.colours.Colour;
import creational.abstractFactory.example2.colours.simpleFactory.ColourFactory;
import creational.abstractFactory.example2.shapes.Shape;
import creational.abstractFactory.example2.shapes.simpleFactory.ShapeFactory;

public abstract class ColourfulShapeAbstractFactory {
    protected final ColourFactory colourFactory;
    protected final ShapeFactory shapeFactory;

    protected ColourfulShapeAbstractFactory(
            ColourFactory colourFactory, ShapeFactory shapeFactory) {
        this.colourFactory = colourFactory;
        this.shapeFactory = shapeFactory;
    }

    public abstract Shape createShape();

    public abstract Colour createColour();
}
