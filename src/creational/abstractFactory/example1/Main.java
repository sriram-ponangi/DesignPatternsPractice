package creational.abstractFactory.example1;

import creational.abstractFactory.example1.factory.BlueFontPaperFactory;
import creational.abstractFactory.example1.factory.PaperFactory;
import creational.abstractFactory.example1.factory.RedFontPaperFactory;

public class Main {
    public static void main(String[] args) {
        PaperFactory blueFont = new BlueFontPaperFactory();
        AbstractFactoryClient blueFactoryClient = new AbstractFactoryClient(blueFont);

        PaperFactory redFont = new RedFontPaperFactory();
        AbstractFactoryClient redFactoryClient = new AbstractFactoryClient(redFont);

        blueFactoryClient.paint();
        redFactoryClient.paint();
    }
}
