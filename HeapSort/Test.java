package pr5beta;

class Test {
	public static void main(String[] args) {
		int[] list = { 16, 12, 15, 11, 8, 7, 13, 7, 6, 1, 2, 4, 5, 9 };
		Heapsort hs = new Heapsort();
		hs.heapsort(list);
		int[] list2 = { -1, -2, -5, 1678, 1748, 1, 5, 0, 2, 19900, 20000 };
		hs.printArray(list);

		/*
		 * System.out.println("With a random heap : "); int[] array =
		 * Heapsort.generateArray(7, 5); hs.heapsort(array);
		 * hs.printArray(array);
		 */
		System.out.println(" Test2: ");
		hs.heapsort(list2);
		hs.printArray(list2);
		// hs.buildMaxHeap(list3);
		// System.out.println("TEST: ");
		// hs.printArray(list3);

		System.out.println("getMax: " + hs.getMaximum(list));

	}
}