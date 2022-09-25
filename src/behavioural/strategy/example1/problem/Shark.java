package behavioural.strategy.example1.problem;

public class Shark implements Animal {
    @Override
    public String eat() {
        return "Eat fish";
    }

    @Override
    public String move() {
        return "Swim!";
    }
}
