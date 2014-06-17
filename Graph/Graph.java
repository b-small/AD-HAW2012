package RahnStanoeva6neu;

/**
 * @author Rene Rahn
 * @author Blagovesta Stanoeva
 **/

public class Graph implements InterfaceGraph {

	int adjMatrix[][];
	public Node[] nodes;

	// Konstruktor - es wird die adjMatrix übergeben sowie die Knoten
	public Graph(int adjMatrix[][], Node[] nodes) {
		this.nodes = nodes;
		this.adjMatrix = adjMatrix;

	}

	@Override
	public void addKante(int nodeFrom, int nodeTo) { // setzt die Kanten
														// (Verbindungen) in
														// adjMatrix
		adjMatrix[nodeFrom][nodeTo] = 1; // 1=Nodes verbunden
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
		// TODO Auto-generated method stub
		return nodes.length;
	}

	@Override
	public void removeKante(int nodeFrom, int nodeTo) {
		adjMatrix[nodeFrom][nodeTo] = 0; // 0=Nodes nicht verbunden

	}

	/**
	 * //Prüfe ob Knoten eine Beziehung haben
	 **/
	public boolean gemeinsameKante(int nodeFrom, int nodeTo) {
		return adjMatrix[nodeFrom][nodeTo] == 1;

	}

	public void depthFirstSearch() {
		// Knoten weiß färben
		for (int i = 0; i < nodes.length; i++) {
			nodes[i].setNodeColour(0);
		}
		// Führe mit allen weißen Knoten durch
		for (int j = 0; j < nodes.length; j++) {
			if (nodes[j].getNodeColour() == 0) {
				depthFirstSearchVisit(nodes[j]);
			}
		}
	}

	public void depthFirstSearchVisit(Node j) { // der aktuelle Knoten wird aus
												// der Methode
												// depthFirstSearch() übergeben
		j.setNodeColour(1); // Farbe des Knotens wird auf grau gesetzt

		for (int i = 1; i < nodes.length; i++) {

			if (nodes[i].getNodeColour() == 0) {
				depthFirstSearchVisit(nodes[i]);
			}

		}
		j.setNodeColour(2); // Farbe des Knotens wird auf schwarz gesetzt

	}

	public void showAdjMatrix() { // Ausgabe als Adjazenzmatrix
		for (int i = 0; i < adjMatrix.length; i++) {

			for (int j = 0; j <= adjMatrix[i].length - 1; j++) {
				System.out.print(adjMatrix[i][j] + "");
			}
			System.out.println("");
		}
		System.out.println("");
	}

	public void showAdjListe() { // Ausgabe als Adjazenzliste

		for (int i = 0; i < adjMatrix.length; i++) {
			System.out.println();
			System.out.print(i + "->");

			for (int j = 0; j <= adjMatrix[i].length - 1; j++) {
				if (adjMatrix[i][j] == 1) {

					System.out.print(j + " ");

				}
			}
		}
		System.out.println();
		System.out.println();
	}
}
