# Java Design Patterns :hammer_and_wrench: (WIP)

Just a repo with notes and examples for Design Patterns

- [x] SOLID Principles Notes

### Creational Design Patterns

1. **Builder Pattern :** The builder pattern is an object creation software design pattern with the intentions of finding a solution to the telescoping constructor anti-pattern.
1. **Simple Factory Pattern / Static Factory Method :** Simple factory is a function or method that returns objects of a varying prototype or class.
1. **Factory Method Pattern :** Creates objects without having to specify the exact class of the object that will be created.
1. **Prototype Pattern :** Allows us to create a copy of an existing object and modify it to our needs, instead of going through the trouble of creating an object from scratch and setting it up.
1. **Abstract Factory Pattern :** Provide an interface for creating families of related or dependent objects without specifying their concrete classes.
1. **Singleton :** Main problem this pattern solves is to ensure that only a single instance of this class exists.
1. **Object Pool :** Object Pool manages a set of instances instead of creating and destroying them on demand

### Structural Design Patterns

Structural Patterns deal with how classes and objects are arrenged or composed.

1. **Adapter :** Converts the interface of a class into another interface the clients expect. Adapter lets classes work together that couldn't otherwise because of incompatible interfaces.
1. **Bridge :** Decouple an abstraction from its implementation so that the two can vary independently.
1. **Composite :** The composite pattern describes that a group of objects is to be treated in the same way as a single instance of an object. The intent of a composite is to "compose" objects into tree structures to represent part-whole hierarchies. Implementing the composite pattern lets clients treat individual objects and compositions uniformly.
1. **Decorator :** When we want to enhance behavior of our existing object dynamically as and when required then we can use decorator design pattern.
1. **Facade :** Provide a unified interface to a set of interfaces in a subsystem. Facade defines a higher-level interface that makes the subsystem easier to use. (Helps to reduce dependencies on outside code.)
1. **Flyweight :** A flyweight is an object that minimizes memory use by sharing as much data as possible with other similar objects; it is a way to use objects in large numbers when a simple repeated representation would use an unacceptable amount of memory.
1. **Proxy :** A proxy, in its most general form, is a class functioning as an interface to something else. A proxy is a wrapper or agent object that is being called by the client to access the real serving object behind the scenes. Use of the proxy can simply be forwarding to the real object, or can provide additional logic. In the proxy extra functionality can be provided, for example caching when operations on the real object are resource intensive, or checking preconditions before operations on the real object are invoked.

### Behavioral Design Patterns

1. **Chain of Responsibility :** Avoid coupling the sender of a request to its receiver by giving more than one object a chance to handle the request. Chain the receiving objects and pass the request along the chain until an object handles it.
1. **Command :** Encapsulate a request as an object, thereby letting you parameterize clients with different requests, queue or log requests, and support undoable operations.
1. **Interpreter :** Given a language, define a representation for its grammar along with an interpreter that uses the representation to interpret sentences in the language.
1. **Iterator :** Provide a way to access the elements of an aggregate object sequentially without exposing its underlying representation.
1. **Mediator :** Mediator decouples a set of classes by forcing their communications flow through a mediating object.
1. **Memento :** Without violating encapsulation, capture and externalize an object's internal state so that the object can be restored to this state later.
1. **Observer :** The observer pattern is a software design pattern in which an object, called the subject, maintains a list of its dependents, called observers, and notifies them automatically of any state changes, usually by calling one of their methods.
1. **State :** The state pattern is a behavioral software design pattern that allows an object to alter its behavior when its internal state changes. This pattern is close to the concept of finite-state machines. The state pattern can be interpreted as a strategy pattern, which is able to switch a strategy through invocations of methods defined in the pattern's interface.
1. **Strategy :** Strategy pattern allows choosing the best-suited algorithm at runtime.
1. **Template :** Template Method pattern outlines the general steps in the parent class and lets the concrete child implementations define the details.
1. **Visitor :** Is a way of separating an algorithm from an object structure on which it operates. A practical result of this separation is the ability to add new operations to existing object structures without modifying the structures.
