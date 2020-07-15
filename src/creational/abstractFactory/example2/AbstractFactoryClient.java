package creational.abstractFactory.example2;

public class AbstractFactoryClient {

    private Shape shape;
    private Colour colour;

    public AbstractFactoryClient(IAbstractFactory abstractFactory){
        this.shape = abstractFactory.createShape();
        this.colour = abstractFactory.createColour();
    }

    public void paint(){
        shape.draw();
        colour.fill();
        System.out.println("\n\n");
    }


}
