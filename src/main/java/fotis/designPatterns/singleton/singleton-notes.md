# Singleton Pattern

1. A *Singleton* class has only one instance, accessible globally through a single point
1. Main problem this pattern solves is to ensure that **only** a single instance of this class exists.
1. Any state that we add in our *Singleton* becomes part of the global state of our application.

### Design Considerations

1. Two options
    1. Early initialization  - Eager Singleton: Create Singleton as soon as the class is loaded.
    1. Lazy initialization - Lazy Singleton: Create Singleton when it is first required.

### Consequences

* Violates Single Responsibility Principle (SRP) by controlling their creation and lifecycle.
* Encourages using a globally shared instance which prevents an object and resources used by this object from being deallocated.
* Creates tightly coupled code. The clients of the Singleton become difficult to test.
* Makes it almost impossible to subclass a Singleton.
* Need special consideration when we have i singleton in a web app that is deployed in several server instances.
