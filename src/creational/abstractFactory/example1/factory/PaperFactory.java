package creational.abstractFactory.example1.factory;

import creational.abstractFactory.example1.characters.Character;
import creational.abstractFactory.example1.shapes.Shape;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface PaperFactory {
    Shape createShape();
    Character createCharacter();
}
