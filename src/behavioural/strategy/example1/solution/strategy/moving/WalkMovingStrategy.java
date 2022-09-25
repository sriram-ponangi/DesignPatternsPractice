package behavioural.strategy.example1.solution.strategy.moving;

public class WalkMovingStrategy implements MovingStrategy {
    @Override
    public String move() {
        return "Walk!";
    }
}
