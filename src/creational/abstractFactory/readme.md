### Definition:

**Abstract Factory** is a creational design pattern, which is used to create a
**family of related/dependent classes** without specifying their concrete classes.

**Abstract Factory** uses **composition principle**. That is, it can have other factories
as dependencies with which we create the family of related/dependent classes.

Abstract Factory defines an interface for creating all distinct products but leaves
the actual product creation to concrete factory classes. Each factory type corresponds
to a certain product variety.

Client code works with factories and products only through their abstract interfaces.
This lets the client code work with any product variants, created by the factory object.
You just create a new concrete factory class and pass it to the client code.

---

**Simple Factory** describes:

- **Approach-1:** A class that has only one create method with a large conditional block (ex: if/else or switch)
  The condition is based on the method parameters which lets the caller choose which child class to instantiate and return.

- **Approach-2:** Instead of a large conditional block in a single method. We can also just create multiple methods.
  The caller then chooses which child class to instantiate by inovking the correct method implemenation.

- See example in **creational.abstractFactory.example2.colours.simpleFactory.ColourFactory**

**Simple Factory**  can be used an intermediate step before creating Factory Method or Abstract Factory patterns
- See example in **creational.abstractFactory.example2.abstractFactory.ColourfulShapeAbstractFactory**
