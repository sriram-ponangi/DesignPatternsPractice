package creational.factoryMethod.example2;

/**
 * This is the Base Creator / Factory Class.
 * This class must have an abstract method that the child can extend to create the object.
 * Notice the createShape() method is abstract and returns the interface Shape.
 */
public abstract class Canvas {
    /**
     * Base factory class. Note that "factory" is merely a role for the class. It
     * should have some core business logic
     */
    public void sketch(String colour){
        System.out.println("Setting up the canvas");
        Shape shape = createShape();
        shape.draw();
        System.out.println("Painting it with "+colour+" colour.");
        System.out.println("\n\n");
    }

    /**
     * Subclasses will override this method in order to create specific Shape
     * objects.
     */
    public abstract Shape createShape();
}
