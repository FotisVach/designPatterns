# Implementation Considerations

1. 

### Design Considerations

1. 2 types of adapters - Class adapter and object adapter. Object adapter is the preferable way of implementing this design pattern.
1. Stick to just adapting to a different Interface in the adapter class. Don't do extra validation or implement extra bushiness logic.  

### Applicability

Use the Adapter pattern when:

1. Convert the interface of a class into another interface the clients expect. Adapter lets classes work together that couldn't otherwise because of incompatible interfaces.
1. Using *Adapter Design pattern* we can make this object work with client by adapting the object to client's expected interface.
1. This pattern is also called as wrappper as it wraps existing objects. 
1. Most of the applications using third party libraries use adapters as a middle layer between the application and the 3rd party library to decouple the application from the library. If another library has to be used only an adapter for the new library is required without having to change the application code.

ex. java.io.InputStreamReader - java.io.OutputStreamReader. Adapting Input/output Stream object to a Reader/Writer Interface.

### Consequences

Class and object adapters have different trade-offs. A class adapter

1. Adapts Adaptee to Target by committing to a concrete Adaptee class. As a consequence, a class adapter won’t work when we want to adapt a class and all its subclasses.
1. Lets Adapter override some of Adaptee’s behavior, since Adapter is a subclass of Adaptee. (This feature can easily be abused)
1. Add method polution because we extend the adaptee class. So the method of the Adaptee class are present through the use of the ClassAdapter. 

An object adapter

1. Let’s a single Adapter work with many Adaptees—that is, the Adaptee itself and all of its subclasses (if any). The Adapter can also add functionality to all Adaptees at once.
1. Makes it harder to override Adaptee behavior. It will require subclassing Adaptee and making Adapter refer to the subclass rather than the Adaptee itself.
