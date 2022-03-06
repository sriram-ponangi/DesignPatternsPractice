package creational.abstractFactory.example2;

import creational.abstractFactory.example2.colours.Colour;
import creational.abstractFactory.example2.abstractFactory.ColourfulShapeAbstractFactory;
import creational.abstractFactory.example2.shapes.Shape;

public class AbstractFactoryClient {

    private final ColourfulShapeAbstractFactory abstractFactory;

    private Shape shape;
    private Colour colour;

    public AbstractFactoryClient(ColourfulShapeAbstractFactory abstractFactory) {
        this.abstractFactory = abstractFactory;
        this.shape = abstractFactory.createShape();
        this.colour = abstractFactory.createColour();
    }

    public void paint() {
        shape.draw();
        colour.fill();
        System.out.println("\n\n");
    }

}
