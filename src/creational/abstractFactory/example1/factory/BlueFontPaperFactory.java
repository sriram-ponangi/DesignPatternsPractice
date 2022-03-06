package creational.abstractFactory.example1.factory;

import creational.abstractFactory.example1.characters.BlueCharacter;
import creational.abstractFactory.example1.characters.Character;
import creational.abstractFactory.example1.shapes.BlueShape;
import creational.abstractFactory.example1.shapes.Shape;

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
