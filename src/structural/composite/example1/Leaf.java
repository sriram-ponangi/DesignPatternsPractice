package structural.composite.example1;

public class Leaf implements Component {
    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void execute() {
        System.out.println(this.name);
    }
}
