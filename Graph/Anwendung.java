package RahnStanoeva6neu;

/**
 * Anwendung.java
 * 
 * @author Rene Rahn
 * @author Blagovesta Stanoeva
 * 
 */
public class Anwendung {
	public static void main(String[] args) {
		Node zeroNode = new Node(0);
		Node firstNode = new Node(1);
		Node secondNode = new Node(2);
		Node thirdNode = new Node(3);

		Node[] nodes = { zeroNode, firstNode, secondNode, thirdNode };

		int[][] adjMatrix = { { 0, 1, 1, 1 }, { 0, 0, 1, 1 }, { 0, 0, 0, 1 },
				{ 0, 0, 0, 0 } };

		Graph graph = new Graph(adjMatrix, nodes);

		System.out.println();
		System.out.println("gerichteter Graph ist gegeben");
		System.out.println();
		System.out.println("Ausgabe als Adjazenzmatrix: ");
		System.out.println();
		graph.showAdjMatrix();
		System.out.println("Ausgabe als Adjazenzliste: ");
		graph.showAdjListe();
		System.out.println("Entferne Kante von 1 zu 2: "); // wir beginnen bei 0
															// zu zählen
		graph.removeKante(1, 2);
		graph.showAdjMatrix();
		System.out.println("Füge Kante von 1 zu 2 wieder hinzu: ");
		graph.addKante(1, 2);
		graph.showAdjMatrix();
		System.out.println("Füge Kante von 2 zu 1 hinzu: ");
		graph.addKante(2, 1);
		System.out.println();
		System.out.println("Ausgabe als Adjazenzmatrix: ");
		graph.showAdjMatrix();
		System.out.println("Ausgabe als Adjazenzliste: ");
		graph.showAdjListe();
		System.out.println();
		// alle Kanten löschen
		graph.removeKante(0, 1);
		graph.removeKante(1, 2);
		graph.removeKante(2, 3);
		graph.removeKante(1, 0);
		graph.removeKante(2, 1);
		graph.removeKante(3, 2);
		graph.removeKante(0, 2);
		graph.removeKante(2, 0);
		graph.removeKante(0, 3);
		graph.removeKante(3, 0);
		graph.removeKante(1, 3);
		graph.removeKante(3, 1);

		// Graph ist leer aber Knoten sind noch vorhanden
		System.out
				.println("alle Kanten wurden gelöscht, Knoten sind noch vorhanden");
		System.out.print("Anzahl der Knoten: " + graph.size());
		System.out.println();

		graph.showAdjMatrix();

	}
}
