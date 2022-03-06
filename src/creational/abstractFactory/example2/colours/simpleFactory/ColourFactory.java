package creational.abstractFactory.example2.colours.simpleFactory;

import creational.abstractFactory.example2.colours.Colour;

public interface ColourFactory {
    // Approach -1:
    Colour createColour(String name);

    // Approach -2:
    Colour createBlue();
    Colour createRed();
}
