# Interpreter Pattern

### Intent

1. Provide a way to access the elements of an aggregate object sequentially without exposing its underlying representation.
1. In object-oriented programming, the iterator pattern is a design pattern in which an iterator is used to traverse a container and access the container's elements.

### Design Considerations

1. Iterator are statefull, (they remember their position)
1. Interface based
1. Factory Method based
1. Independent, but fail fast
1. Enumerators are fail safe.

### Applicability

Use the Iterator pattern when :

1. To access an aggregate object's contents without exposing its internal representation.
1. To support multiple traversals of aggregate objects.
1. To provide a uniform interface for traversing different aggregate structures.

ex. java.util.iterator, java.util.Enumarator

### Consequences

1. We don't have access to the index line in a for loop. 
1. Making modifications to the Collection class often makes that iterator instance invalid
