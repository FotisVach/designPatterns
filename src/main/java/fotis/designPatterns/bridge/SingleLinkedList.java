package fotis.designPatterns.bridge;

import java.util.NoSuchElementException;

/**
 * A concrete implementor.
 * This implementation is a classic LinkedList using nodes.
 * @param <T> Type of Element
 */
@SuppressWarnings("javadoc")
class SingleLinkedList<T> implements LinkedList<T> {
	
	/**
	 * First element of the list
	 */
	private Node<T> first;
	/**
	 * Last element of the list
	 */
	private Node<T> last;
	/**
	 * Size of the list
	 */
	private int size;

	@Override
	public void addFirst(T element) {
		if (first == null) {
			Node<T> n = new Node<T>(element, null);
			first = n;
			last = n;
		} else {
			first = new Node<T>(element, first);
		}
	}

	@Override
	public T removeFirst() {
		if (first == null)
            throw new NoSuchElementException();
		T tempData = first.item;
		if (first.next != null) {
			first = first.next;
		} else {
			first = null;
			last = null;
		}
		size--;
		return tempData;
	}

	@Override
	public void addLast(T element) {
		Node<T> l = last;
		Node<T> newNode = new Node<T>(element, null);
		last = newNode;
		if (l == null) {
			first = newNode;
		} else {
			l.next = newNode;
		}
		size++;
	}

	@Override
	public int getSize() {
		return size;
	}
	
	private class Node<I> {
        I item;
        Node<I> next;

        Node(I element, Node<I> next) {
            this.item = element;
            this.next = next;
        }
    }

}
