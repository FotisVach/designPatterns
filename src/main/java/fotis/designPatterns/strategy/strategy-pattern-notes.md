# Strategy Pattern

### Intent

1. Strategy pattern allows choosing the best-suited algorithm at runtime.

### Design Considerations

1. Eliminate conditional statements
1. Behavior encapsulated in classes
1. Client aware of strategies
1. Client chooses strategy

Pieces: Interface/Abstract base class, Concrete class per Strategy -> Context, Strategy, Concrete Strategy

### Applicability

Use the Strategy Pattern when :

1. Many related classes differ only in their behavior. Strategies provide a way to configure a class either one of many behaviors
1. You need different variants of an algorithm. for example, you might define algorithms reflecting different space/time trade-offs. Strategies can be used when these variants are implemented as a class hierarchy of algorithms
1. An algorithm uses data that clients shouldn't know about. Use the Strategy pattern to avoid exposing complex algorithm-specific data structures
1. A class defines many behaviors, and these appear as multiple conditional statements in its operations. Instead of many conditionals, move the related conditional branches into their own Strategy class

ex: java.util.Comporator

### Consequences

1. Client aware of possible strategies
1. Increased number of class
