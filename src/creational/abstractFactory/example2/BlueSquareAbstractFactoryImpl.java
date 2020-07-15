package creational.abstractFactory.example2;

public class BlueSquareAbstractFactoryImpl implements IAbstractFactory {
    @Override
    public Shape createShape() {
        return new Square();
    }

    @Override
    public Colour createColour() {
        return new Blue();
    }
}
