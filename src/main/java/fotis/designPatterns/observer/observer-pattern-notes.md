# Observer Pattern

### Intent

1. Define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.
1. The observer pattern is a software design pattern in which an object, called the subject, maintains a list of its dependents, called observers, and notifies them automatically of any state changes, usually by calling one of their methods.

### Design Considerations

1. Can be used with the Mediator Pattern.
1. Watch out for circular updates.

Subject, ConcreteSubject, Observer, Concrete Observer

### Applicability

Use the observer pattern in any of the following situations :

1. When an abstraction has two aspects, one dependent on the other. Encapsulating these aspects in separate objects lets you vary and reuse them independently.
1. When a change to one object requires changing others, and you don't know how many objects need to be changed.
1. When an object should be able to notify other objects without making assumptions about who these objects are. In other words, you don't want these objects tightly coupled.

ex. java.util.observer, java.util.EventListener, javax.jms.Topic, ServletRequestListener

### Consequences

1. Unexpected updates are possible
1. Difficult to know what has changed - difficult debugging
1. Performance hit in the case of many observers or slow observers
