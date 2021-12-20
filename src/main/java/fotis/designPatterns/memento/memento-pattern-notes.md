# Memento Pattern

### Intent

1. Without violating encapsulation, capture and externalize an object's internal state so that the object can be restored to this state later.
1. Implement Undo/Rollback

### Design Considerations

1. Originator
1. Memento
1. Caretaker

### Applicability

Use the Memento pattern when :

1. A snapshot of an object's state must be saved so that it can be restored to that state later
1. A direct interface to obtaining the state would expose implementation details and break the object's encapsulation

ex. java.util.Date, java.io.Serializable

### Consequences

1. Can be expensive
1. Caretaker may need to delete history, because saved states may consume a lot of memory. 
1. Careful not to expose originator information
