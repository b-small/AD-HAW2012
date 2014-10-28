package myGraph;

/**
 * IGraph.java
 * 
 * @author Rene Rahn
 * @author Blagovesta Stanoeva
 * 
 */
public interface IGraph {

	void addEdge(int nodeFrom, int nodeTo);

	void removeEdge(int nodeFrom, int nodeTo);

	boolean isCommonEdge(int nodeFrom, int nodeTo);

	boolean isEmpty();

	int size();

	void depthFirstSearch();

	void depthFirstSearchVisit(Node j);
}