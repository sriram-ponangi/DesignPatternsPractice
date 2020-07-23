package structural.bridge.example1;

public class Triangle implements Shape {
    protected Color color;

    public Triangle(Color color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Draw TRIANGLE in "+ color.paint() + " color");
    }
}
