package structural.composite.example1;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
    private final List<Component> children = new ArrayList<>();

    public boolean add(Component c){
        return this.children.add(c);
    }
    public boolean remove(Component c){
        return this.children.remove(c);
    }

    @Override
    public void execute() {
        for(Component c: this.children){
            c.execute();
        }
    }
}
