# Proxy Pattern

### Intent

1. Provide a surrogate or placeholder for another object to control access to it.
1. A proxy, in its most general form, is a class functioning as an interface to something else. A proxy is a wrapper or agent object that is being called by the client to access the real serving object behind the scenes. Use of the proxy can simply be forwarding to the real object, or can provide additional logic. In the proxy extra functionality can be provided, for example caching when operations on the real object are resource intensive, or checking preconditions before operations on the real object are invoked.

### Design Considerations

1. Interface Based
1. Interface and Implementation Class
1. java.lang.reflect.InvocationHandler

Pieces: Client, Interface, InvocationHandler, Proxy, Implementation

### Applicability

Proxy is applicable whenever there is a need for a more versatile or sophisticated reference to an object than a simple pointer. Here are several common situations in which the Proxy pattern is applicable.:

1. Remote proxy provides a local representative for an object in a different address space.
1. Virtual proxy creates expensive objects on demand.
1. Protection proxy controls access to the original object. Protection proxies are useful when objects should have different access rights.

ex. java.lang.reflect.Proxy, hibernate lazy loading in collections

### Consequences

1. Java's dynamic Proxy only works if our class is implementing one or more interfaces. Proxy is created by implementing these interfaces.
1. Only one Proxy
1. Adds another abstraction layer.
