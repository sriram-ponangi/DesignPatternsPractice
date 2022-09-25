package behavioural.strategy.example1.solution.strategy.eating;

import behavioural.strategy.example1.solution.strategy.eating.EatingStrategy;

public class GrassEatingStrategy implements EatingStrategy {
    @Override
    public String eat() {
        return "Eat grass";
    }
}
