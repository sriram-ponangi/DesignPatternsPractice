package behavioural.strategy.example1.solution.strategy.eating;

import behavioural.strategy.example1.solution.strategy.eating.EatingStrategy;

public class WormEatingStrategy implements EatingStrategy {
    @Override
    public String eat() {
        return "Eat worm";
    }
}
