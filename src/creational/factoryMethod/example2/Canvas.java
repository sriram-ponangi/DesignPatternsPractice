package creational.factoryMethod.example2;

public abstract class Canvas {
    public void draw(String colour){
        System.out.println("Setting up the canvas");
        Shape shape = createShape();
        shape.create();
        System.out.println("Painting it with "+colour+" colour.");
        System.out.println("\n\n");
    }

    public abstract Shape createShape();
}
