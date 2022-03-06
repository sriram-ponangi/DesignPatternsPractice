package creational.abstractFactory.example1;

import creational.abstractFactory.example1.characters.Character;
import creational.abstractFactory.example1.factory.PaperFactory;
import creational.abstractFactory.example1.shapes.Shape;

public class AbstractFactoryClient {
    private final PaperFactory paperFactory;

    private Shape shape;
    private Character character;

    public AbstractFactoryClient(PaperFactory paperFactory) {
        this.paperFactory = paperFactory;
        this.shape = paperFactory.createShape();
        this.character = paperFactory.createCharacter();
    }

    public void paint() {
        shape.draw();
        character.write();
        System.out.println("\n\n");
    }
}
