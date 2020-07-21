### Definition:
**Builder** is a creational design pattern which is used
 to construct complex objects step by step.

It is useful when you need to create an object with lots 
of possible configuration options.

**Example:**
Creating different house objects with multiple configurations
such as HouseWithGarage, HouseWithGarden, 
HouseWithSwimmingPool, etc.

The simplest solution is to extend the base House class
and create a set of subclasses to cover all combinations
of the parameters. But eventually you’ll end up with a
considerable number of subclasses. Any new parameter,
such as the Garage, Garden, etc will require growing this 
hierarchy even more.

There’s another approach that doesn’t involve breeding
subclasses. You can create a giant constructor right
in the base House class with all possible parameters
that control the house object. While this approach indeed
eliminates the need for subclasses, it creates other
problems. In most cases most of the parameters will be unused,
making the constructor calls pretty ugly.

**Solution:**
The Builder pattern suggests that you extract the object
construction code out of its own class and move it to
separate objects called builders.

---
References:
1. [refacctoring.guru](https://refactoring.guru/design-patterns/builder/)
