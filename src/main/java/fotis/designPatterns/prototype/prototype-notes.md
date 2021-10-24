# Prototype Pattern notes

### Intent

* Specify the kinds of objects to create using a prototypical instance, and create new objects by copying this prototype.

### Explanation

* First, it should be noted that the Prototype pattern is not used to gain performance benefits. It's only used for creating new objects from prototype instances.
*In short, it allows you to create a copy of an existing object and modify it to your needs, instead of going through the trouble of creating an object from scratch and setting it up.

### Applicability

* When the classes to instantiate are specified at run-time, for example, by dynamic loading.
* To avoid building a class hierarchy of factories that parallels the class hierarchy of products.
* When instances of a class can have one of only a few different combinations of state. It may be more convenient to install a corresponding number of prototypes and clone them rather than instantiating the class manually, each time with the appropriate state.
* When object creation is expensive compared to cloning.

### Design Considerations

* Cloneable interface can be useful(keep in mind the possible need for deep copies) 
* Cloneable is a marker interface, an indication that the class supports cloning

### Pitfalls

* Deep copies are not always an easy task to do