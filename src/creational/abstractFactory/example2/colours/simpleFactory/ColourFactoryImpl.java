package creational.abstractFactory.example2.colours.simpleFactory;

import creational.abstractFactory.example2.colours.Blue;
import creational.abstractFactory.example2.colours.Colour;
import creational.abstractFactory.example2.colours.Red;

public class ColourFactoryImpl implements ColourFactory {

    // Approach -1:
    @Override
    public Colour createColour(String name) {
        if (name == null) {
            return null;
        }

        if (name.equalsIgnoreCase("red")) {
            return new Red();
        } else if (name.equalsIgnoreCase("blue")) {
            return new Blue();
        } else {
            return null;
        }
    }

    // Approach -2:
    @Override
    public Colour createBlue() {
        return new Blue();
    }

    @Override
    public Colour createRed() {
        return new Red();
    }


}
