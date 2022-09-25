package behavioural.strategy.example1.problem;

public class Cow implements Animal {
    @Override
    public String eat() {
        return "Eat grass";
    }

    @Override
    public String move() {
        return "Walk!";
    }
}
