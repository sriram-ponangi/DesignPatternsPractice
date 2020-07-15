package creational.abstractFactory.example2;

public class RedCircleAbstractFactoryImpl implements IAbstractFactory{

    @Override
    public Shape createShape() {
        return new Circle();
    }

    @Override
    public Colour createColour() {
        return new Red();
    }
}
