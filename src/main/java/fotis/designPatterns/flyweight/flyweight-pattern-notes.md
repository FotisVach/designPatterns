# Flyweight Pattern

### Intent

1. More efficient use of memory. When we have a large number of similar objects.
1. Use sharing to support large numbers of fine-grained objects efficiently.
1. A flyweight is an object that minimizes memory use by sharing as much data as possible with other similar objects; it is a way to use objects in large numbers when a simple repeated representation would use an unacceptable amount of memory. -> ** A sort of Cache ** 

### Design Considerations

1. Pattern of patterns.
1. Utilizes a factory pattern
1. Encompasses Creation and Structure
1. Client, Factory, Flyweight, ConcreteFlyweight

### Applicability

Use the Flyweight pattern when all of the following are true:

1. An application uses a large number of objects.
1. Storage costs are high because of the sheer quantity of objects.
1. Most of the object state can be made extrinsic.
1. Many groups of objects may be replaced by relatively few shared objects once the extrinsic state is removed.
1. The application doesn't depend on object identity. Since flyweight objects may be shared, identity tests will return true for conceptually distinct objects.

ex. java.lang.String, java.langInteger#ValueOf(int) and similarly for Byte, Character and other wrapped types.

### Consequences

1. Complex Pattern.
1. Premature optimization. Need to optimize upfront.
