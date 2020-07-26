## Definition:
- In the case where we might need multiple instances of a particular object
but each instance occupies a lot of memory, we use the **flyweight pattern**.
- This pattern helps us create a fine grained instance to save memory. In other words
we try to **reduce the number of objects that are being created**.
- Here we try to **reuse the existing objects by storing them and by creating a new object
only when no matching object is found.**
- Usually used when creating approximately a million objects.
- Example: DB Connection pool - A new connection is not created for every new query, they
are reused.

- Intrinsic Properties of an object are the properties which are same for all objects. So these must be 
separated and created only once.
- Extrinsic Properties of an object are the properties which are different for each object.

---
### References:
[refactoring.guru](https://refactoring.guru/design-patterns/facade/java/example#example-0)