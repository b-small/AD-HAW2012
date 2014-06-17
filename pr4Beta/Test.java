package pr4Beta;

/**
 * Test.java // Testklasse
 * 
 * @author Blagovesta Stanoeva
 * @author Rene Rahn
 */

public class Test {

	public static void main(String[] args) {
		LinearList ll = new LinearList();
		ll.insert("d");
		ll.insert("o");
		ll.insert("o");
		ll.insert("f");
		ll.insert("y");
		System.out.println("Contains?? >" + ll.contains("o"));

		ll.get(2);
		System.out.println("Size (5) " + ll.size());
		ll.isEmpty();
		System.out.println("Is it empty?? >" + ll.isEmpty());
		ll.removeInt(2);
		ll.removeInt(1);
		System.out.println("Size: (3) " + +ll.size());

		ll.clear();
		System.out.println("Is it empty?? >" + ll.isEmpty());

		System.out.println("Contains?? >" + ll.contains("o"));

		ll.insert(1);
		ll.insert(2);
		ll.insert(3);
		ll.insert(4);
		ll.insert(5);

		System.out.println("inserted 1,2,3,4,5");

		System.out.println("Contains?? >" + ll.contains(5));

		System.out.println("TEST SUCCESSFUL");

	}
}