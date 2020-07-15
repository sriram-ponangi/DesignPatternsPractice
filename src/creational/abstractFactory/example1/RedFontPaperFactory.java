package creational.abstractFactory.example1;

public class RedFontPaperFactory implements PaperFactory {
    @Override
    public Shape createShape() {
        return new RedShape();
    }

    @Override
    public Character createCharacter() {
        return new RedCharacter();
    }
}
