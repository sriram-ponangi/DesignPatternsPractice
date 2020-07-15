package creational.abstractFactory.example1;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface PaperFactory {
    Shape createShape();
    Character createCharacter();
}
