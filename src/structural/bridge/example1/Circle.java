package structural.bridge.example1;

public class Circle implements Shape {
    protected Color color;

    public Circle(Color color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Draw CIRCLE in "+ color.paint() + " color");
    }
}
