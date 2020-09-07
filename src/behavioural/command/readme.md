### Definition:

**Command pattern** is a data driven design pattern. Here a request object
(RequestShares class in example-1) is wrapped inside a command object
(OrderCommand implementations) and passed to the
invoker object (StockBroker class). The invoker object then looks for the 
appropriate object which can handle this command and passes the object to the
appropriate method in corresponding object (BuySharesCommand and SellSharesCommand classes)
which executes it.


The command execution method doesn’t have any parameters, so to pass the request 
details to the receiver we must ensure that the command should be either 
pre-configured with this data, or capable of getting it on its own.

