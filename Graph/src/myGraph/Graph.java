package myGraph;

/**
 * @author Rene Rahn
 * @author Blagovesta Stanoeva
 **/

public class Graph implements IGraph {

	int adjacencyMatrix[][];
	public Node[] nodes;

	public Graph(int adjMatrix[][], Node[] nodes) {
		this.nodes = nodes;
		this.adjacencyMatrix = adjMatrix;
	}

	@Override
	public void addEdge(int nodeFrom, int nodeTo) {
		adjacencyMatrix[nodeFrom][nodeTo] = 1; // 1=Nodes are connected
	}

	@Override
	public boolean isEmpty() {
		if (nodes.length == 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int size() {
		return nodes.length;
	}

	@Override
	public void removeEdge(int nodeFrom, int nodeTo) {
		adjacencyMatrix[nodeFrom][nodeTo] = 0; // 0=Nodes not connected
	}

	/**
	 * Check if 2 nodes are connected
	 **/
	public boolean isCommonEdge(int nodeFrom, int nodeTo) {
		return adjacencyMatrix[nodeFrom][nodeTo] == 1;

	}

	public void depthFirstSearch() {
		// Color the nodes in white
		for (int i = 0; i < nodes.length; i++) {
			nodes[i].setNodeColour(0);
		}

		for (int j = 0; j < nodes.length; j++) {
			if (nodes[j].getNodeColour() == 0) {
				depthFirstSearchVisit(nodes[j]);
			}
		}
	}

	public void depthFirstSearchVisit(Node j) {
		// change the color of the current node from white to grey
		j.setNodeColour(1);

		for (int i = 1; i < nodes.length; i++) {
			if (nodes[i].getNodeColour() == 0) {
				depthFirstSearchVisit(nodes[i]);
			}
		}
		j.setNodeColour(2); // at the end of the depth search, we color the node
							// black
	}

	public void showAdjMatrix() {
		for (int i = 0; i < adjacencyMatrix.length; i++) {

			for (int j = 0; j <= adjacencyMatrix[i].length - 1; j++) {
				System.out.print(adjacencyMatrix[i][j] + "");
			}
			System.out.println("");
		}
		System.out.println("");
	}

	public void showAdjList() {

		for (int i = 0; i < adjacencyMatrix.length; i++) {
			System.out.println();
			System.out.print(i + "->");

			for (int j = 0; j <= adjacencyMatrix[i].length - 1; j++) {
				if (adjacencyMatrix[i][j] == 1) {

					System.out.print(j + " ");
				}
			}
		}
		System.out.println();
		System.out.println();
	}
}
