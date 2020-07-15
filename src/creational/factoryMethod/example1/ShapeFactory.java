package creational.factoryMethod.example1;

public class ShapeFactory {
    public Shape getShape(String type){
        if(type == null){
            return null;
        }
        else if(type.equalsIgnoreCase("Rectangle")){
            return new Rectangle();
        }
        else if(type.equalsIgnoreCase("Square")){
            return new Square();
        }
        return null;
    }
}