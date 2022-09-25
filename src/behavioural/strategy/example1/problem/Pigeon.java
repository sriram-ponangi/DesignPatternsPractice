package behavioural.strategy.example1.problem;

public class Pigeon implements Animal {
    @Override
    public String eat() {
        return "Eat worms";
    }

    @Override
    public String move() {
        return "Fly!";
    }
}
