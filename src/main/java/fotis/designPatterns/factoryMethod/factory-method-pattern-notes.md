# Factory Method Pattern notes

1. The creator can a concrete class & provide a default implementation for the factory method.
1. Creator hierarchy in Factory Method Pattern reflects the product hierarchy. We typically end up with a concrete creator per object type.
1. Another creational design pattern called *Abstract Factory* makes use of Factory method Pattern.

ex. *java.util.AbstractCollection<E>* contains a creator for Interface *Iterator*

--- 

### Pitfalls

1. More complex to implement. More classes involved and need unit testing.
1. We have to start with Factory Method from the beginning. It's not easy to refactor existing code into factory method pattern.
1. Sometimes this pattern forces you to subclass just to create an appropriate instance. 
