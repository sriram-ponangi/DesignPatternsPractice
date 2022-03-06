package creational.abstractFactory.example2.abstractFactory;

import creational.abstractFactory.example2.colours.Colour;
import creational.abstractFactory.example2.colours.simpleFactory.ColourFactory;
import creational.abstractFactory.example2.shapes.Shape;
import creational.abstractFactory.example2.shapes.simpleFactory.ShapeFactory;

public class BlueSquareAbstractFactoryImpl extends ColourfulShapeAbstractFactory {
    public BlueSquareAbstractFactoryImpl(
            ColourFactory colourFactory,
            ShapeFactory shapeFactory) {
        super(colourFactory, shapeFactory);
    }

    @Override
    public Shape createShape() {
        return shapeFactory.createSquare();
    }

    @Override
    public Colour createColour() {
        return colourFactory.createBlue();
    }
}
