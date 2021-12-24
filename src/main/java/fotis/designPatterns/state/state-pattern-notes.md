# State Pattern

### Intent

1. The state pattern is a behavioral software design pattern that allows an object to alter its behavior when its internal state changes. This pattern is close to the concept of finite-state machines. The state pattern can be interpreted as a strategy pattern, which is able to switch a strategy through invocations of methods defined in the pattern's interface.

### Design Considerations

1. Different action based on object state.
1. Client is unaware of state.

Pieces: Context, State, ConcreteState

### Applicability

Use the State Pattern when :

1. An object's behavior depends on its state, and it must change its behavior at run-time depending on that state
1. Operations have large, multipart conditional statements that depend on the object's state. This state is usually represented by one or more enumerated constants. Often, several operations will contain this same conditional structure. The State pattern puts each branch of the conditional in a separate class. This lets you treat the object's state as an object in its own right that can vary independently from other objects

ex. jsf(Java Server Faces)

### Consequences

1. Complex Testing.
1. More Classes
