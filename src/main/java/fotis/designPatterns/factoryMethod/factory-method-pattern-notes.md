# Factory Method Pattern notes

### Intent 

In class-based programming, the factory method pattern is a creational pattern that uses factory methods to deal with the problem of creating objects without having to specify the exact class of the object that will be created. This is done by creating objects by calling a factory method — either specified in an interface and implemented by child classes, or implemented in a base class and optionally overridden by derived classes—rather than by calling a constructor.

### Design Considerations

1. Creator hierarchy in Factory Method Pattern reflects the product hierarchy. 
1. Another creational design pattern called *Abstract Factory* makes use of Factory method Pattern.

ex. *java.util.AbstractCollection<E>* contains a creator for Interface *Iterator*

--- 

### Pitfalls

1. More complex to implement. More classes involved and need unit testing.
1. We have to start with Factory Method from the beginning. It's not easy to refactor existing code into factory method pattern.
