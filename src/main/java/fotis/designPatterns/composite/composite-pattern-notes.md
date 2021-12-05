# Intent

In software engineering, the composite pattern is a partitioning design pattern. The composite pattern describes that a group of objects is to be treated in the same way as a single instance of an object. The intent of a composite is to "compose" objects into tree structures to represent part-whole hierarchies. Implementing the composite pattern lets clients treat individual objects and compositions uniformly.

### Design Considerations

1. We can provide a method to access the parent of a node. This will simplify traversal of the entire tree.
1. We can define the collection field to maintain children in base component instead of composite but again that field has no use in leaf class.
1. Some times caching leaf nodes can be profitable.
1. Decision needs to be mad about where child management operation are defined. Defining them on component provides transparency but leaf nodes are forced to implement those methods. Defining them on composite is safer but client needs to be made aware of composite.

### Applicability

Use the Composite pattern when:

1. We have a parent-child or whole-part relation between objects. We can use composite pattern to simplify dealing with such object arrangements.
1. Goal of composite pattern is to simplify the client code by allowing it to treat the composites and leaf nodes in the same way.
1. Composites will delegate the operations to its children while leaf nodes implement the functionality.

### Consequences

1. Creating the original hierarchy can still be complex implementation  - especially if we use caching.
1. We have no compile time safety - and we must rely on runtime type checks.
