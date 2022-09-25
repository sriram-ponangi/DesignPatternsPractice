package behavioural.strategy.example1.solution.strategy.moving;

public class SwimMovingStrategy implements MovingStrategy {
    @Override
    public String move() {
        return "Swim!";
    }
}
