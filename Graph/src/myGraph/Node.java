package myGraph;

/**
 * Node.java
 * 
 * @author Rene Rahn
 * @author Blagovesta Stanoeva
 * 
 */
public class Node {

	int nodeColour = 0; // 0 = white, 1 = grey, 2 = black
	int nodeIdx;

	public Node(int nodeIdx) {
		this.nodeIdx = nodeIdx;
	}

	public int getNodeColour() {
		return nodeColour;
	}

	public void setNodeColour(int nodeColour) {
		if (nodeColour == 0 || nodeColour == 1 || nodeColour == 2) {
			this.nodeColour = nodeColour;
		} else {
			throw new IllegalArgumentException("invalid node colour");
		}
	}

	public int getNodeIdx() {
		return nodeIdx;
	}

	public void setNodeIdx(int nodeIdx) {
		this.nodeIdx = nodeIdx;
	}
}
