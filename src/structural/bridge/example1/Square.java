package structural.bridge.example1;

public class Square implements Shape {
    protected Color color;

    public Square(Color color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Draw SQUARE in "+ color.paint() + " color");
    }
}
