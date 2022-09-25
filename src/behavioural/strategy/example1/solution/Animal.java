package behavioural.strategy.example1.solution;

import behavioural.strategy.example1.solution.strategy.eating.EatingStrategy;
import behavioural.strategy.example1.solution.strategy.moving.MovingStrategy;

public class Animal {
    private final EatingStrategy eatStrategy;
    private final MovingStrategy moveStrategy;

    public Animal(EatingStrategy eatStrategy, MovingStrategy moveStrategy) {
        this.eatStrategy = eatStrategy;
        this.moveStrategy = moveStrategy;
    }

    public EatingStrategy getEatStrategy() {
        return eatStrategy;
    }

    public MovingStrategy getMoveStrategy() {
        return moveStrategy;
    }
}
