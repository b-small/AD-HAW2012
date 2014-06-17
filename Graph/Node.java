package RahnStanoeva6neu;

/**
 * Node.java
 * 
 * @author Rene Rahn
 * @author Blagovesta Stanoeva
 * 
 */
public class Node {
	int nodeColour = 0; // 0=weiﬂ, 1=grau, 2=schwarz

	int nodeIdx; // Entspricht einer der indizes von adjMatrix

	/**
	 * //Konstruktor
	 **/

	public Node(int nodeIdx) {
		this.nodeIdx = nodeIdx;
	}

	/**
	 * //Getter & Setter
	 **/

	public int getNodeColour() {
		return nodeColour;
	}

	public void setNodeColour(int nodeColour) {
		this.nodeColour = nodeColour;
	}

	public int getNodeIdx() {
		return nodeIdx;
	}

	public void setNodeIdx(int nodeIdx) {
		this.nodeIdx = nodeIdx;

	}

}
