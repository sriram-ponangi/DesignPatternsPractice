## Notes:

- The **Builder** interface declares product construction steps
that are common to all types of builders.

- **Concrete Builders** (CarBuilder) provides different implementations 
of the construction steps in the common Builder interface. **Concrete builders may
produce products that don’t follow the common interface.**

- **Products** (Car) are resulting objects. Products constructed
 by different builders don’t have to belong to the same
 class hierarchy or interface.

- The **Director** class defines the order in which to call
 construction steps, so you can create and reuse specific
 configurations of products.
 
- The **Client** (Main) must associate one of the builder
 objects with the **director**.
    - Usually, it’s done just once, via parameters of
     the director’s constructor. Then the director uses
     that builder object for all further construction.
      
    - **However, there’s an alternative approach 
    for when the client passes the builder object to
    the production method of the director.
    In this case, you can use a different builder each 
    time you produce something with the director.** 
    
---
REFERENCES:
- The Entire text above is from [refactoring.guru](https://refactoring.guru/design-patterns/builder)