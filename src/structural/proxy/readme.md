## Definition:
- Proxy pattern provides a placeholder for another object 
to control access to it.
- Proxy pattern is used to solve access related problems.
- The proxy class look like the other object (that it is controlling
access to) for the client.
- Type of proxy:   
    - **Virtual proxy**: Used to control access to an object
     that is expensive to create. (Ex: Caching)
        - **[Example-1]()** Similar to Singleton
    - **Protection proxy**: Used to control access to an object
    based on the access rights of the client.
        - **[Example-2]()**
    - **Remote proxy**: To interact with an object or something that 
    is outside of the application.
        - **[Example-3]()**