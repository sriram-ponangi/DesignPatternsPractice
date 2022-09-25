package behavioural.strategy.example1.problem;

public class Main {
    public static void main(String[] args) {
        Animal cow = new Cow();
        Animal shark = new Shark();

        Animal parrot = new Parrot();
        Animal pigeon = new Pigeon();
        Animal vulture = new Vulture();

        System.out.println("Cows:    "+cow.eat() +" and "+ cow.move());
        System.out.println("Sharks:  "+shark.eat() +" and "+ shark.move());

        System.out.println("parrot:  "+parrot.eat() +" and "+ parrot.move());
        System.out.println("pigeon:  "+pigeon.eat() +" and "+ pigeon.move());
        System.out.println("vulture: "+vulture.eat() +" and "+ vulture.move());
    }
}
