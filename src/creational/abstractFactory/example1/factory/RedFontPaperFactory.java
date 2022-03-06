package creational.abstractFactory.example1.factory;

import creational.abstractFactory.example1.characters.Character;
import creational.abstractFactory.example1.characters.RedCharacter;
import creational.abstractFactory.example1.shapes.RedShape;
import creational.abstractFactory.example1.shapes.Shape;

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
