# Chain of Responsibility Pattern

### Intent

1. Avoid coupling the sender of a request to its receiver by giving more than one object a chance to handle the request. Chain the receiving objects and pass the request along the chain until an object handles it.
1. In object-oriented design, the chain-of-responsibility pattern is a design pattern consisting of a source of command objects and a series of processing objects. Each processing object contains logic that defines the types of command objects that it can handle; the rest are passed to the next processing object in the chain.

### Design Considerations

1. Chain of receiver objects
1. Handler is interface based
1. ConcreteHandler for each implementation
1. Each Handler has a reference to then next 

-> Client -> Handler -> ConcreteHandlers

### Implementation Considerations

1. Define Handler interface/abstract class
    1. Handler must define a method to accept incoming requests.
    1. Handler can define a method to access successor in chain
1. We implement handler in one or more concrete classes. Concrete Handler should check if it can handle the request or forward it to the next Handler.

### Applicability

Use Chain of Responsibility when:

1. More than one object may handle a request, and the handler isn't known a priori. The handler should be ascertained automatically.
1. You want to issue a request to one of several objects without specifying the receiver explicitly.
1. The set of objects that can handle a request should be specified dynamically.


ex. java.util.logging.Logger#log(), Spring Security Filter Chain, javax.Servlet.Filter

### Consequences

1. No guarantee that the request will be handled.
1. Easy to misconfigure the chain.
