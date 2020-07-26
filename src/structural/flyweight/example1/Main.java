package structural.flyweight.example1;


import java.util.Random;

public class Main {
    static int TREES_IN_FOREST = 10;
    public static void main(String[] args) {

        Forest forest = new Forest();
        for (int i = 0; i < Math.floor(TREES_IN_FOREST / TreeTypes.values().length); i++) {
            forest.addNewTree(random() , random(), TreeTypes.BROWN_TREE);
            forest.addNewTree(random() , random(), TreeTypes.GREEN_TREE);
        }
        forest.showAllForestTrees();
    }

    private static double random() {
        Random random = new Random();
        return random.nextDouble();
    }
}
