package structural.flyweight.example1;

import java.util.HashMap;
import java.util.Map;

public class TreeTypeFactory {

    private static Map<TreeTypes, Type> treeTypes = new HashMap<>();

    public static Type getBrownTree(){
        Type result = treeTypes.get(TreeTypes.BROWN_TREE);
        if (result == null) {
            System.out.println("Creating a new BROWN TREE type");
            result = new Type(TreeTypes.BROWN_TREE, "BROWN",
                    "Tree usually turn brown in the Fall and Winter seasons" );
            treeTypes.put(TreeTypes.BROWN_TREE, result);
        }
        return result;
    }

    public static Type createGreenTree(){
        Type result = treeTypes.get(TreeTypes.GREEN_TREE);
        if (result == null) {
            System.out.println("Creating a new GREEN TREE type");
            result = new Type(TreeTypes.GREEN_TREE, "GREEN",
                    "Tree usually turn green in the Spring season" );
            treeTypes.put(TreeTypes.GREEN_TREE, result);
        }
        return result;
    }
}