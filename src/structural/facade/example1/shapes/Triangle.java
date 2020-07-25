package structural.facade.example1.shapes;

import structural.facade.example1.colours.Colour;

public class Triangle implements Shape {
    protected Colour colour;

    public Triangle(Colour colour) {
        this.colour = colour;
    }

    @Override
    public void draw() {
        System.out.println("Draw TRIANGLE in "+ colour.paint() + " colour");
    }
}
