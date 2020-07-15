package creational.factoryMethod.example2;

public class DrawSquareOnCanvas extends Canvas {
    @Override
    public Shape createShape() {
        return new Square();
    }
}
