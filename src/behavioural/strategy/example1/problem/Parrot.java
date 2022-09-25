package behavioural.strategy.example1.problem;

public class Parrot implements Animal {
    @Override
    public String eat() {
        return "Eat fruits";
    }

    @Override
    public String move() {
        return "Fly!";
    }
}
