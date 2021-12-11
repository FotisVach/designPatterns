# Command Pattern

### Intent

1. Encapsulate a request as an object, thereby letting you parameterize clients with different requests, queue or log requests, and support undoable operations.
1. In object-oriented programming, the command pattern is a behavioral design pattern in which an object is used to encapsulate all information needed to perform an action or trigger an event at a later time.

### Design Considerations

1. 

### Implementation Considerations

1. We start by writing the Command interface. It must define a method which executes the command.
1. We implement this interface in a Class for each request or operation type we want to implement. Command should also allow for undo operation if our system needs it.
1. Each concrete command knows exactly which operation it needs. All it needs is parameters for the operation if required and the receiver instance on which operation is invoked.
1. Client creates the command instance , sets up receiver and provides all required parameters.

### Applicability

Use Command Pattern when:

1. Parameterize objects by an action to perform. You can express such parameterization in a procedural language with a callback function, that is, a function that's registered somewhere to be called at a later point. Commands are an object-oriented replacement for callbacks.
1. Specify, queue, and execute requests at different times. A Command object can have a life independent of the original request. If the receiver of a request can be represented in an address space-independent way, then you can transfer a command object for the request to a different process and fulfill the request there.
1. Support undo. The Command's execute operation can store state for reversing its effects in the command itself. The Command interface must have an added un-execute operation that reverses the effects of a previous call to execute. The executed commands are stored in a history list. Unlimited-level undo and redo functionality is achieved by traversing this list backward and forward calling un-execute and execute, respectively.
1. Support logging changes so that they can be reapplied in case of a system crash. By augmenting the Command interface with load and store operations, you can keep a persistent log of changes. Recovering from a crash involves reloading logged commands from the disk and re-executing them with the execute operation.
Structure a system around high-level operations build on primitive operations. Such a structure is common in information systems that support transactions. A transaction encapsulates a set of data changes. The Command pattern offers a way to model transactions. Commands have a common interface, letting you invoke all transactions the same way. The pattern also makes it easy to extend the system with new transactions.
1. Keep a history of requests.
1. Implement callback functionality.
1. Implement the undo functionality.

ex. java.lang.Runnable

### Consequences

1. Error handling is difficult.
