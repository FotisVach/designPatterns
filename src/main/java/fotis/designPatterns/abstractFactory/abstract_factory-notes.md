# Implementation Considerations

1. When you have multiple sets of objects where objects in one set work together then you can use *abstract factory pattern* to isolate code from concrete objects & their factories.
1. *Abstract factory* itself uses *factory method pattern* and you can think of them as objects with multiple factory methods.
1. Factories can be implemented as *singletons*.
1. Adding a new product type requires changes to the base factory as well as all implementations of factory.
1. We provide client code with concrete factory instance. Factories can be changes at runtime.

### Design Considerations

1. When you want to constrain object creations so that they all work together, then abstract factory is good design pattern.
1. Abstract factory uses factory method pattern.
1. If objects are expensive to create then you can switch factory implementation to user prototype pattern to create objects.

### Applicability

Use the Abstract Factory pattern when

1. The system should be independent of how its products are created, composed, and represented
1. The system should be configured with one of the multiple families of products
1. The family of related product objects is designed to be used together, and you need to enforce this constraint
1. You want to provide a class library of products, and you want to reveal just their interfaces, not their implementations
1. The lifetime of the dependency is conceptually shorter than the lifetime of the consumer.
1. You need a run-time value to construct a particular dependency
1. You want to decide which product to call from a family at runtime.
1. You need to supply one or more parameters only known at run-time before you can resolve a dependency.
1. When you need consistency among products
1. You don’t want to change existing code when adding new products or families of products to the program.

### Pitfalls

1. More complex than factory method.  
1. Adding a new product type requires changes to the base factory as well as all implementations of factory.
1. Difficult to visualize the need at the start of the development and usually starts out as a factory method.
1. Is very specific to the problem of "product families".
