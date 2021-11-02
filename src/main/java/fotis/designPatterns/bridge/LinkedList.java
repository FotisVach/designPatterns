package fotis.designPatterns.bridge;

/**
 * This is the implementor. Note that this is also an Interface. As implementor
 * is defining its own hierarchy which is not related at all to the abstraction
 * hierarchy.
 * 
 * @param <T>
 *            Type of Element
 */
@SuppressWarnings("javadoc")
interface LinkedList<T> {

	void addFirst(T element);

	T removeFirst();

	void addLast(T element);

	int getSize();
}
