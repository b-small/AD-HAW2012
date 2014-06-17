package pr5beta;

/**
 * Heapsort.java
 * 
 * @author Blagovesta Stanoeva
 * @author Rene Rahn
 * 
 */

public class Heapsort {

	private static int heapSize;

	/*
	 * public static int[] generateArray(int laenge, int K) { int[] array = new
	 * int[laenge];
	 * 
	 * for (int i = 0; i < laenge; i++) { array = new int[laenge + 1]; array[i]
	 * = (int) (Math.random() * (K - 1)) + 1; } return array; }
	 */

	void maxHeapify(int[] A, int i) {
		int l = Left(i); // linkes Kind
		int r = Right(i); // rechtes Kind
		int max;
		if (l < heapSize) { // existiert l?
			if (l < heapSize && A[l] > A[i]) { // Wenn l größer als sein Vater
												// ist, wird l maximum
				max = l;
			} else {
				max = i; // sonst bleibt der Vater maximum
			}

			if (r < heapSize && A[r] > A[max]) {
				max = r;
			}

			if (max != i) {
				swap(A, i, max); // swapping max mit dem Vater
				maxHeapify(A, max);
			}
		}
	}

	public void buildMaxHeap(int[] A) {
		for (int i = A.length / 2 - 1; i >= 0; i--) {
			maxHeapify(A, i);
		}
	}

	public void heapsort(int[] A) {
		heapSize = A.length;
		buildMaxHeap(A);
		for (int i = A.length - 1; i > 0; i--) {
			swap(A, 0, i);
			heapSize--;
			maxHeapify(A, 0);
		}
	}

	private int Left(int i) {
		return 2 * i;
	}

	private int Right(int i) {
		return (2 * i) + 1;
	}

	private static void swap(int[] A, int i, int j) {
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;

	}

	public void printArray(int[] A) {
		for (int i = 0; i <= A.length - 1; i++) {
			System.out.print(A[i] + " ");
		}
	}

	/**
	 * Warteschlange
	 * 
	 */

	public int getMaximum(int[] A) {

		int largest = A[0];
		for (int x = 0; x < A.length; x++) {
			if (A[x] > largest) {
				largest = A[x];
			}
		}
		return largest;
	}
	// nicht funktionierende Methoden
	/*
	 * public int extractMax(int[] A) { int max = 0; while (A.length >= 1) {
	 * 
	 * max = A[0]; A[0] = A[A.length - 1]; System.arraycopy(A, 0, A, 0, A.length
	 * - 1); maxHeapify(A, 1); max = getMaximum(A); } return max; }
	 * 
	 * public void increaseKey(int[] A,int i,int key){ while (key>=A[i]){
	 * A[i]=key; } while (i>1 && A[]) { } }
	 */
}
