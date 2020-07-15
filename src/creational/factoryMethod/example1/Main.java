package creational.factoryMethod.example1;

public class Main {

    public static void main(String[] args){
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape rectangle = shapeFactory.getShape("Rectangle");
        Shape square = shapeFactory.getShape("Square");

        System.out.println("Creational Pattern :: Factory Method Example: ");
        rectangle.draw();
        square.draw();

    }
}