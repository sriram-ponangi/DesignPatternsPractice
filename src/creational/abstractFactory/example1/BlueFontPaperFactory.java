package creational.abstractFactory.example1;

public class BlueFontPaperFactory implements PaperFactory {
    @Override
    public Shape createShape() {
        return new BlueShape();
    }

    @Override
    public Character createCharacter() {
        return new BlueCharacter();
    }
}
