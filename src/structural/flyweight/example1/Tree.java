package structural.flyweight.example1;

public class Tree {
    // Intrinsic Attributes
    private double latitude;
    private double longitude;

    // Extrinsic Attribute
    private Type type;

    public Tree(double latitude, double longitude, Type type) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.type = type;
    }

    public void getObjectHashCode(){
        System.out.println(this.hashCode() +"----"+this.type.hashCode());
    }

    public void showTree() {
        System.out.println("Planting : " + this);
    }

    @Override
    public String toString() {
        return "\nTree{" +
                "\nlatitude=" + latitude +
                "\n, longitude=" + longitude +
                "\n, type=" + type +
                "\n}";
    }
}