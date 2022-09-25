package behavioural.strategy.example1.solution.strategy.moving;

public class FlyMovingStrategy implements MovingStrategy {
    @Override
    public String move() {
        return "Fly!";
    }
}
