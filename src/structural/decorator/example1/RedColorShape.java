package structural.decorator.example1;

public class RedColorShape extends ShapeDecorator {
    public RedColorShape(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        super.draw();
        this.addRedColor();
        System.out.println("\n");
    }

    public void addRedColor(){
        System.out.println("ADDING :: RED COLOR");
    }
}
