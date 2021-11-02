package fotis.designPatterns.bridge;

/**
 * This is the abstraction.
 * <p>
 * It represents a FiFo Collection.
 * 
 * @param <T>
 *            Type of collection
 */
interface FifoCollection<T> {

	/**
	 * Adds element to collection
	 * 
	 * @param element
	 */
	void offer(T element);

	/**
	 * Removes and Returns the first element from the collection.
	 * 
	 * @return element
	 */
	T poll();

}
