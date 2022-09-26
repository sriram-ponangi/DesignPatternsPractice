Problem:
* In the example-1 the algorithm written in `move()` is common across all the three birds (vulture, parrot and pigeon) but because we initially used the inheritence directly from the Animal interface they had to reimplemented(repeated) in all three bird classes.

Solution:
* One way to solve it is by using multiple inheritence (Animal and Bird as interfaces). But to solve a problem with inheritence the solution not using more inheritence.
* Composition is more suitable for the code reusability usecase than inheritence.
* Strategy pattern implements the algorith separately and is injected into the interface so that we can reuse it if needed.

Strategy is a behavioral design pattern that lets you define a family of algorithms, put each of them into a separate class, and make their objects interchangeable.[Source](https://refactoring.guru/design-patterns/strategy)


