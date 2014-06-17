package pr4Beta;

/**
 * LinearList.java // Implementierung der Linearen Liste
 * 
 * @author Blagovesta Stanoeva
 * @author Rene Rahn
 */

public class LinearList {

	private Node head;
	int size = 0;

	/**
	 * Constructs an empty list
	 */
	public LinearList() {
		head = null;
	}

	/**
	 * Returns true if the list is empty
	 */
	public boolean isEmpty() {
		return head == null;
	}

	/**
	 * Inserts a new node to the end of this list.
	 */
	public void insert(Object item) {
		if (isEmpty()) {
			this.head = new Node(item);
			size++;
		} else {
			Node current = this.head;
			while (current.getNext() != null) {

				current = current.getNext();
			}
			current.next = new Node(item);
			size++;
		}
	}

	/**
	 * Removes all nodes from the list.
	 */
	public void clear() {
		head = null;
		size = 0;
	}

	/**
	 * Returns true if this list contains the element.
	 */

	public boolean contains(Object item) {
		Node current = this.head;
		boolean x = false;
		while (current != null) {

			if (current.element.equals(item)) {
				x = true;
			}
			current = current.getNext();
		}
		return x;
	}

	/**
	 * Returns the data at the specified position in the list.
	 */

	public Object get(int pos) {
		if (head == null)
			throw new IndexOutOfBoundsException();

		Node tmp = head;
		for (int k = 0; k < pos; k++)
			tmp = tmp.next;

		if (tmp == null)
			throw new IndexOutOfBoundsException();
		return tmp;
	}

	/**
	 * Removes the element at the index from the list.
	 * 
	 */

	public void removeInt(int idx) {
		Node current = this.head;
		if (idx == 0) {
			head = head.next;

		} else {
			for (int i = 0; i < idx - 1; i++) {
				current = current.next;
				// current.setNext(current.next.next);

			}
			size--;
		}
	}

	/**
	 * returns the Size of the List
	 * 
	 */

	public int size() {
		return size;
	}
}
