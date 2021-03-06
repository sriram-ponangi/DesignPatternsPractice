package structural.facade.example1.shapes;

import structural.facade.example1.colours.Colour;

public class Circle implements Shape {
    protected Colour colour;

    public Circle(Colour colour) {
        this.colour = colour;
    }

    @Override
    public void draw() {
        System.out.println("Draw CIRCLE in "+ colour.paint() + " colour");
    }
}
