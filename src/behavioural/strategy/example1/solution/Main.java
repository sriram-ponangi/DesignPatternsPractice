package behavioural.strategy.example1.solution;

import behavioural.strategy.example1.solution.strategy.eating.*;
import behavioural.strategy.example1.solution.strategy.moving.SwimMovingStrategy;
import behavioural.strategy.example1.solution.strategy.moving.WalkMovingStrategy;

public class Main {
    public static void main(String[] args) {
        //Dependency Injection
        Animal cow = new Animal(new GrassEatingStrategy(), new WalkMovingStrategy());
        Animal shark = new Animal(new FishEatingStrategy(), new SwimMovingStrategy());

        //Reused the SwimMovingStrategy algorithm
        Animal parrot = new Animal(new FruitEatingStrategy(), new SwimMovingStrategy());
        Animal pigeon = new Animal(new WormEatingStrategy(), new SwimMovingStrategy());
        Animal vulture = new Animal(new DeadAnimalEatingStrategy(), new SwimMovingStrategy());


        System.out.println("Cows: "+cow.getEatStrategy().eat() +" and "+ cow.getMoveStrategy().move());
        System.out.println("Shark: "+shark.getEatStrategy().eat() +" and "+ shark.getMoveStrategy().move());

        System.out.println("parrot: "+parrot.getEatStrategy().eat() +" and "+ parrot.getMoveStrategy().move());
        System.out.println("pigeon: "+pigeon.getEatStrategy().eat() +" and "+ pigeon.getMoveStrategy().move());
        System.out.println("vulture: "+vulture.getEatStrategy().eat() +" and "+ vulture.getMoveStrategy().move());
    }
}
