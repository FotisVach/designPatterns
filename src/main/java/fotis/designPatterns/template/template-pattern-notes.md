# Template Pattern

### Intent

1. Define the skeleton of an algorithm in an operation, deferring some steps to subclasses. Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.
1. Template Method pattern outlines the general steps in the parent class and lets the concrete child implementations define the details.

### Design Considerations

1. Abstract base class
1. Base calls Child

Pieces: AbstractBase, ConcreteClass

### Applicability

Use the Template Pattern when :

1. When common behavior among subclasses should be factored and localized in a common class to avoid code duplication. You first identify the differences in the existing code and then separate the differences into new operations. Finally, you replace the differing code with a template method that calls one of these new operations
1. To control subclasses extensions. You can define a template method that calls "hook" operations at specific points, thereby permitting extensions only at those points

ex: java.util.Collections#sort(), java.util.AbstractList#indexOf(), javax.servlet.GenericServlet#init

### Consequences

1. Complicated hierarchy
1. Difficult to unit test
