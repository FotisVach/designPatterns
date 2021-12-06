# Decorator Pattern

### Intent

1. When we want to enhance behavior of our existing object dynamically as and when required then we can use decorator design pattern. 
1. Attach additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.
1. In object-oriented programming, the decorator pattern is a design pattern that allows behavior to be added to an individual object, either statically or dynamically, without affecting the behavior of other objects from the same class. The decorator pattern is often useful for adhering to the Single Responsibility Principle, as it allows functionality to be divided between classes with unique areas of concern.
1. When extension by subclassing is impractical. Sometimes a large number of independent extensions are possible and would produce an explosion of subclasses to support every combination. Or a class definition may be hidden or otherwise unavailable for subclassing.

### Implementation Considerations

1. Also called Wrapper.
1. Adds behavior without affecting others.
1. More than just inheritance.
1. Follows single Responsibility principle.
1. Compose behavior dynamically.
1. Utilizes composition and inheritance.
1. Constructor requires instance from hierarchy.

### Design Considerations

1. Pay attention to equals() and hashCode() methods.

### Applicability

Use the Decorator pattern when:

1. Add responsibilities to individual objects dynamically and transparently, that is, without affecting other objects.
1. For responsibilities that can be withdrawn.
1. When extension by subclassing is impractical. Sometimes a large number of independent extensions are possible and would produce an explosion of subclasses to support every combination. Or a class definition may be hidden or otherwise unavailable for subclassing.

ex. java.io.InputStream, java.io.OutputStream, java.io.Reader and java.io.Writer

### Consequences

1. Easy to mistake this for multiple inheritance.
1. Often result in a large number of classes added to the system.
