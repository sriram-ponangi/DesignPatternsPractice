package creational.abstractFactory.example2;

import creational.abstractFactory.example2.abstractFactory.BlueSquareAbstractFactoryImpl;
import creational.abstractFactory.example2.abstractFactory.RedCircleAbstractFactoryImpl;
import creational.abstractFactory.example2.abstractFactory.RedSquareAbstractFactoryImpl;
import creational.abstractFactory.example2.colours.simpleFactory.ColourFactory;
import creational.abstractFactory.example2.colours.simpleFactory.ColourFactoryImpl;
import creational.abstractFactory.example2.shapes.simpleFactory.ShapeFactory;
import creational.abstractFactory.example2.shapes.simpleFactory.ShapeFactoryImpl;

public class Main {

    private final ShapeFactory shapeFactory;
    private final ColourFactory colourFactory;

    public Main(ShapeFactory shapeFactory,
                ColourFactory colourFactory) {
        this.shapeFactory = shapeFactory;
        this.colourFactory = colourFactory;
    }

    public static void main(String[] args) {
        Main main = new Main(new ShapeFactoryImpl(), new ColourFactoryImpl());

        AbstractFactoryClient redCircleClient = new AbstractFactoryClient(
                new RedCircleAbstractFactoryImpl(main.colourFactory, main.shapeFactory));

        AbstractFactoryClient blueSquareClient = new AbstractFactoryClient(
                new BlueSquareAbstractFactoryImpl(main.colourFactory, main.shapeFactory));

        AbstractFactoryClient redSquareClient = new AbstractFactoryClient(
                new RedSquareAbstractFactoryImpl(main.colourFactory, main.shapeFactory));

        redCircleClient.paint();
        blueSquareClient.paint();
        redSquareClient.paint();
    }
}
