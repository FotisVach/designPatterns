# SOLID notes

1. **Single Responsibility**
    A class should only have one responsibility. Furthermore, it should only have one reason to change.
1. **Open/Closed (Open for Extension, Closed for Modification)**
    Classes should be open for extension but closed for modification.
1. **Liskov Substitution**
    We should design our classes so that client dependencies can be substituted with subclasses without the client knowing about the change. In other words, if class A is a subtype of class B, then we should be able to replace B with A without interrupting the behavior of the program.
1. **Interface Segregation**
    Larger interfaces should be split into smaller ones. By doing so, we can ensure that implementing classes only need to be concerned about the methods that are of interest to them. Also helps reduce Interface pollution.
1. **Dependency Inversion**
	The principle states that we must use abstraction (abstract classes and interfaces) instead of concrete implementations. High-level modules should not depend on the low-level module but both should depend on the abstraction. Because the abstraction does not depend on detail but the detail depends on abstraction. It decouples the software.
