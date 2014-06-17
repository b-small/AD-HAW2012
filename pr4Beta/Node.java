package pr4Beta;

/**
 * Node.java // Knoten
 * 
 * @author Blagovesta Stanoeva
 * @author Rene Rahn
 */
public class Node {
	public Object element;
	public Node next;

	public Node(Object obj) {
		this.element = obj;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Node getNext() {
		return this.next;
	}

	public Object getElement() {
		return this.element;
	}

	public Node() {
		this.element = null;
		this.next = null;
	}
}
