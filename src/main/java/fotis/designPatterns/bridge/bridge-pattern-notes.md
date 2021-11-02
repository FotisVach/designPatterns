# Bridge Pattern :bridge_at_night:

### Intent

Decouple an abstraction from its implementation so that the two can vary independently.

### Implementation Considerations

1. The bridge pattern is a design pattern used in software engineering that is meant to "decouple an abstraction from its implementation so that the two can vary independently"
1. Bridge pattern is about preferring composition over inheritance. Implementation details are pushed from a hierarchy to another object with a separate hierarchy.

### Consequences

1. Needs to be designed up front. Adding bridge to legacy code is difficult. Even for ongoing project adding bridge at a later time in development may require a fair amount of rework.
