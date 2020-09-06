### Definition:

**Chain of Responsibility** is a behavioral design pattern that lets
 you pass requests along a chain of handlers.
 Upon receiving a request, each handler decides 
 either to process the request or to pass it to the next 
 handler in the chain.
 
 
 Like many other behavioral design patterns, the 
 **Chain of Responsibility** relies on transforming particular
 behaviors into stand-alone objects called handlers.
 
 The pattern suggests that you link these handlers into a chain.
 Each linked handler has a **field for storing a reference to the
 next handler** in the chain. In addition to **processing a request**, 
 handlers pass the request further along the chain. 
 The request travels along the chain until all handlers have had a 
 chance to process it.
 
 All handler classes implement the same interface.
 Each concrete handler should only care about the following handler having
 the execute method.
 
 It's important to understand that a request sent into the chain 
 may not be handled. It may fall off the end of the chain, 
 this possibility must be factored into your design before you use 
 this pattern. This design allows us to write event handling systems 
 in a way such that the code that triggers the event does not 
 have to worry about which class will handle the event.
 
 
 
 
 

---
References:
1. [refacctoring.guru](https://refactoring.guru/design-patterns/chain-of-responsibility)