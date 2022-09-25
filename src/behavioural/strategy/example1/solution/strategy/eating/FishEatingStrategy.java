package behavioural.strategy.example1.solution.strategy.eating;

import behavioural.strategy.example1.solution.strategy.eating.EatingStrategy;

public class FishEatingStrategy implements EatingStrategy {
    @Override
    public String eat() {
        return "Eat fish";
    }
}
