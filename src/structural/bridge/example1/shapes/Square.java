package structural.bridge.example1.shapes;

import structural.bridge.example1.colours.Colour;

public class Square implements Shape {
    protected Colour colour;

    public Square(Colour colour) {
        this.colour = colour;
    }

    @Override
    public void draw() {
        System.out.println("Draw SQUARE in "+ colour.paint() + " colour");
    }
}
