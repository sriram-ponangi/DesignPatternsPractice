package behavioural.strategy.example1.problem;

public class Vulture implements Animal {
    @Override
    public String eat() {
        return  "Eat dead animals";
    }

    @Override
    public String move() {
        return"Fly!";
    }
}
