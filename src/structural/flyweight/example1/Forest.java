package structural.flyweight.example1;


import java.util.ArrayList;
import java.util.List;

public class Forest {
    private List<Tree> trees = new ArrayList<>();

    boolean addNewTree(double latitude, double longitude, TreeTypes treeType){
        Type type = null;
        if(treeType == TreeTypes.GREEN_TREE){
            type = TreeTypeFactory.createGreenTree();
        }
        else if(treeType == TreeTypes.BROWN_TREE){
            type = TreeTypeFactory.getBrownTree();
        }
        Tree tree = new Tree(latitude, longitude, type);
        return trees.add(tree);
    }

    public void showAllForestTrees(){
        for (Tree tree : trees) {
//            tree.showTree();
            tree.getObjectHashCode();
        }
        System.out.println("Total number of trees in the forest: " + trees.size());

    }


}
