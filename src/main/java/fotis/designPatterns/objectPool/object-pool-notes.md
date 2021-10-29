# Implementation Considerations

1. One of the most difficult patterns to implement.

### Design Considerations

1. A thread-safe caching of objects should be done in pool.
1. Methods to acquire and release objects should be provided.
1. The reuse object can provide methods to reset its state upon "release" from code. (?) The reset method must not be very expensive.
1. We have to decide whether to create new pooled objects when pool is empty or to wait until an object becomes available. Choice is influenced by whether the object is tied to a fixed number of external resources.
1. Pre-caching objects; meaning creating objects in advance can be helpful as it won't slow down the code using these objects. However it may add-up to start up time & memory consumption.

ex. java.util.ThreadPoolExecutor
ex2. org.apache.commons.dbcp.BasicDatasource

### Applicability

Use the Object Pool pattern when

1. 1. In our system, if the cost of creating an instance of a class is high and we need a large number of objects of this class for short duration, then we can use an object pool.
1. Here we either pre-create objects of the class or collect unused instances in an in memory cache. When the code needs an object of this class we provide it from the cache. 

### Pitfalls

1. Successful implementation depends on correct use by the client code. For example releasing objects back to pool can be vital for correct working.
1. You have to decide what happens when the pool is empty and there is a demand for an object. You can either wait for an object to become free or create a new object. Both options have issues. 
