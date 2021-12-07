# Facade Pattern

### Intent

1. Facade provides a simple and unified interface to a subsystem. Client interacts with just the facade now to get same result.
1. Make an API easier to use.
1. Helps to reduce dependencies on outside code.
1. Simplify the interface or client usage.
1. Usually a refactoring pattern.
1. Facade is not just a one to one method forwarding to other classes.

### Design Considerations

1. Class that utilizes composition
1. Should not have a need for inheritance
1. Typically encompasses full lifecycle.

### Applicability

Use the Facade pattern when:

1. You want to provide a simple interface to a complex subsystem. Subsystems often get more complex as they evolve. Most patterns, when applied, result in more and smaller classes. This makes the subsystem more reusable and easier to customize, but it also becomes harder to use for clients that don't need to customize it. A facade can provide a simple default view of the subsystem that is good enough for most clients. Only clients needing more customization will need to look beyond the facade.
1. There are many dependencies between clients and the implementation classes of an abstraction. Introduce a facade to decouple the subsystem from clients and other subsystems, thereby promoting subsystem independence and portability.
1. You want to layer your subsystems. Use a facade to define an entry point to each subsystem level. If subsystems are dependent, then you can simplify the dependencies between them by making them communicate with each other solely through their facades.

ex. java.net.URL

### Consequences

0. Should be used for refactoring old code, not for new implementations. 
1. Often misused.
