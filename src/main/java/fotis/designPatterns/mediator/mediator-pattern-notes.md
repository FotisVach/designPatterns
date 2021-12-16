# Mediator Pattern

### Intent

1. Define an object that encapsulates how a set of objects interact. Mediator promotes loose coupling by keeping objects from referring to each other explicitly, and it lets you vary their interaction independently.
1. Mediator decouples a set of classes by forcing their communications flow through a mediating object.
1. In software engineering, the mediator pattern defines an object that encapsulates how a set of objects interact. This pattern is considered to be a behavioral pattern due to the way it can alter the program's running behavior. In object-oriented programming, programs often consist of many classes. Business logic and computation are distributed among these classes. However, as more classes are added to a program, especially during maintenance and/or refactoring, the problem of communication between these classes may become more complex. This makes the program harder to read and maintain. Furthermore, it can become difficult to change the program, since any change may affect code in several other classes. With the mediator pattern, communication between objects is encapsulated within a mediator object. Objects no longer communicate directly with each other, but instead communicate through the mediator. This reduces the dependencies between communicating objects, thereby reducing coupling.

### Design Considerations

1. When a colleague runs we need to also update the states of the rest colleagues in the mediator.

Mediator, ConcreteMediator

### Applicability

Use the Mediator pattern when :

1. A set of objects communicate in well-defined but complex ways. The resulting interdependencies are unstructured and difficult to understand
1. Reusing an object is difficult because it refers to and communicates with many other objects
1. A behavior that's distributed between several classes should be customizable without a lot of subclassing

ex. java.util.Timer, java.lang.reflect.Method#invoke()

### Consequences

1. Mediator becomes a central control object. As complexity of interaction grows, mediator complexity can quickly get out of hand.
1. Limits subclassing
