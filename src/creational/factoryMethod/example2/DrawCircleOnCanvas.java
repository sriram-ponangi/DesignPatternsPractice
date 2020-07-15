package creational.factoryMethod.example2;

public class DrawCircleOnCanvas extends Canvas{

    @Override
    public Shape createShape() {
        return new Circle();
    }
}
