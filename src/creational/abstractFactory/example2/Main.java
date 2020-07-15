package creational.abstractFactory.example2;

public class Main {
    public static void main(String[] args) {
        RedCircleAbstractFactoryImpl redCircle = new RedCircleAbstractFactoryImpl();
        AbstractFactoryClient redCircleClient = new AbstractFactoryClient(redCircle);

        BlueSquareAbstractFactoryImpl blueSquare = new BlueSquareAbstractFactoryImpl();
        AbstractFactoryClient blueSquareClient = new AbstractFactoryClient(blueSquare);

        RedSquareAbstractFactoryImpl redSquare = new RedSquareAbstractFactoryImpl();
        AbstractFactoryClient redSquareClient = new AbstractFactoryClient(redSquare);

        redCircleClient.paint();
        blueSquareClient.paint();
        redSquareClient.paint();
    }
}
