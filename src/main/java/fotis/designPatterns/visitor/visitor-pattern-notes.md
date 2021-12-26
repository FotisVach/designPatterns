# Visitor Pattern

### Intent

1. In object-oriented programming and software engineering, the visitor design pattern is a way of separating an algorithm from an object structure on which it operates. A practical result of this separation is the ability to add new operations to existing object structures without modifying the structures.

### Design Considerations

1. Adding functionality can be as simple as adding a new visitor class

Pieces: Visitor, Concrete Visitor, Element, Concrete Element

### Applicability

ex: java.lang.model.element.Element, Apache Wicket component tree - MarkupContainer

### Consequences

1. Often visitors need access to the object's state, so we end up exposing a lot of the state through getter methods
1. Supporting a new class in our visitors requires changes to all visitor implementations
