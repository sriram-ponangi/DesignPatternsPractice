package structural.composite.example1;

public class Main {
    public static void main(String[] args) {
        Component component = getTree();
        component.execute();
    }

    private static Component getTree(){
        Composite root = new Composite();
        root.add(new Leaf("L1.1"));
        root.add(new Leaf("L1.2"));

        Composite c1 = new Composite();
        c1.add(new Leaf("L2.1"));
        c1.add(new Leaf("L2.2"));
        c1.add(new Leaf("L2.3"));

        Composite c2 = new Composite();
        c2.add(new Leaf("L3.1"));
        c2.add(new Leaf("L3.2"));
        c2.add(new Leaf("L3.3"));
        c2.add(new Leaf("L3.4"));

        c1.add(c2);

        root.add(c1);


//        System.out.println(c1.remove(c2));

        return root;
    }
}
