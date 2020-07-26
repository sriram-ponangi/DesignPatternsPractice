package structural.flyweight.example1;

public class Type {
    private TreeTypes name;
    private String color;
    private String otherTreeData;

    public Type(TreeTypes name, String color, String otherTreeData) {
        this.name = name;
        this.color = color;
        this.otherTreeData = otherTreeData;
    }

    @Override
    public String toString() {
        return "\nTreeType{" +
                "\nname='" + name + '\'' +
                "\n, color=" + color +
                "\n, otherTreeData='" + otherTreeData + '\'' +
                "\n}";
    }
}