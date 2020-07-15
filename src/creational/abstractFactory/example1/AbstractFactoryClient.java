package creational.abstractFactory.example1;

public class AbstractFactoryClient {
    private Shape shape;
    private Character character;

    public AbstractFactoryClient(PaperFactory paperFactory){
        this.shape = paperFactory.createShape();
        this.character = paperFactory.createCharacter();
    }

    public void paint(){
        shape.draw();
        character.write();
        System.out.println("\n\n");
    }
}
