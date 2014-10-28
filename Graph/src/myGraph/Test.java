package myGraph;

/**
 * Anwendung.java
 * 
 * @author Rene Rahn
 * @author Blagovesta Stanoeva
 * 
 */
public class Test {
	public static void main(String[] args) {

		Node zeroNode = new Node(0);
		Node firstNode = new Node(1);
		Node secondNode = new Node(2);
		Node thirdNode = new Node(3);

		Node[] nodes = { zeroNode, firstNode, secondNode, thirdNode };

		int[][] adjMatrix = { { 0, 1, 1, 1 }, { 0, 0, 1, 1 }, { 0, 0, 0, 1 },
				{ 0, 0, 0, 0 } };

		Graph graph = new Graph(adjMatrix, nodes);

		System.out.println("We are given a directed graph\n");
		System.out.println("Output as adjacency matrix:\n");
		graph.showAdjMatrix();
		System.out.println("Output as adjacency list:");
		graph.showAdjList();
		System.out.println("Remove edge from 1 to 2:\n");

		graph.removeEdge(1, 2);
		graph.showAdjMatrix();
		System.out.println("Add edge from 1 to 2:\n");
		graph.addEdge(1, 2);
		graph.showAdjMatrix();
		System.out.println("Add edge from 2 to 1:");
		graph.addEdge(2, 1);
		System.out.println("Output as adjacency matrix:\n");
		graph.showAdjMatrix();
		System.out.println("Output as adjacency list:");
		graph.showAdjList();

		// remove all edges
		graph.removeEdge(0, 1);
		graph.removeEdge(1, 2);
		graph.removeEdge(2, 3);
		graph.removeEdge(1, 0);
		graph.removeEdge(2, 1);
		graph.removeEdge(3, 2);
		graph.removeEdge(0, 2);
		graph.removeEdge(2, 0);
		graph.removeEdge(0, 3);
		graph.removeEdge(3, 0);
		graph.removeEdge(1, 3);
		graph.removeEdge(3, 1);

		// Graph is empty, but we still have Nodes
		System.out
				.println("All edges were deleted, but we still have the nodes");
		System.out
				.print(String.format("Number of nodes: %d\n\n", graph.size()));

		graph.showAdjMatrix();

	}
}
