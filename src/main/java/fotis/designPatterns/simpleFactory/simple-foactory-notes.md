# Simple Factory (Kind of) Pattern notes

### Intent

* Providing a static method encapsulated in a class called the *SimpleFactory*, to hide the implementation logic and make client code focus on usage rather than initializing new objects.
* *Simple Factory* is an object for creating other objects – formally a factory is a function or method that returns objects of a varying prototype or class.

### Applicability

* Use the factory pattern when you only care about the creation of a object, not how to create and manage it.

#### Pros

* Allows keeping all objects creation in one place and avoid of spreading 'new' keyword across codebase.
* Allows to write loosely coupled code. Some of its main advantages include better testability, easy-to-understand code, swappable components, scalability and isolated features.

#### Cons

* The code becomes more complicated than it should be.
