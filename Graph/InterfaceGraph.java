package RahnStanoeva6neu;

/**
 * InterfaceGraph.java
 * 
 * @author Rene Rahn
 * @author Blagovesta Stanoeva
 * 
 */
public interface InterfaceGraph {

	void addKante(int nodeFrom, int nodeTo);

	void removeKante(int nodeFrom, int nodeTo);

	boolean gemeinsameKante(int nodeFrom, int nodeTo);

	boolean isEmpty();

	int size();

	void depthFirstSearch();

	void depthFirstSearchVisit(Node j);

}
