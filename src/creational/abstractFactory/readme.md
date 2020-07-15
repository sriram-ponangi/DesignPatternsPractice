### Definition:

**Abstract Factory** is a creational design pattern, which solves the problem of creating
**entire product families** without specifying their concrete classes.

Abstract Factory defines an interface for creating all distinct products but leaves
the actual product creation to concrete factory classes. Each factory type corresponds
to a certain product variety.

Client code works with factories and products only through their abstract interfaces.
This lets the client code work with any product variants, created by the factory object.
You just create a new concrete factory class and pass it to the client code.


In this example, Shapes and Alphabets will act as products. 
They can have many two variants based on the colour but for now let us consider these two:
red and blue.

Abstract factory knows about all (abstract) product types (**See Example-1: PaperFactory interface**)




---
References:
1. [refacctoring.guru](https://refactoring.guru/design-patterns/abstract-factory/java/)