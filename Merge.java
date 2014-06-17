package pr3;

import java.util.Arrays;

/**
 * Merge.java
 * 
 * @author Blagovesta Stanoeva
 * @author René Rahn
 * @param a
 *            , b - zwei sortierte Arrays
 * @param ab
 *            - sortiertes Array, Produkt von a und b
 * 
 */

public class Merge {
	/*
	 * Wir implementieren die statische Methode merge(..), die als Parametern 2
	 * sortierte Arrays erhält und ein sort. Array als Ausgabe produziert.
	 */
	public static int[] merge(int[] a, int[] b) {

		int[] ab = new int[a.length + b.length]; // Wir speichern erstmal die
													// ungeordnete Elemente in 1
													// Array
		System.arraycopy(a, 0, ab, 0, a.length); // sichere Kopie mit
													// .arraycopy()
		System.arraycopy(b, 0, ab, a.length, b.length);
		int i = 0, j = 0, k = 0;
		while (i < a.length && j < b.length) {
			if (a[i] < b[j]) {
				ab[k] = a[i];
				i++;
			} else {
				ab[k] = b[j];
				j++;
			}
			k++;
		}

		while (i < a.length) {
			ab[k] = a[i];
			i++;
			k++;
		}

		while (j < b.length) {
			ab[k] = b[j];
			j++;
			k++;
		}

		System.out.println(" " + Arrays.toString(ab)); // Consoleausgabe

		return ab;
	}

	/* Testen im Form von main-Methode */

	public static void main(String[] args) {
		int[] A = { 1, 2, 3, 4, 4, 5, 6, 6, 7 };
		int[] B = { 4, 5, 5, 5, 6, 7, 8, 9 };

		System.out.println("Test 1: ");
		merge(A, B);

		int[] C = { 9, 15, 16, 28 };
		int[] D = { 1, 8, 14, 15, 26, 31 };
		System.out.println("Test 2: ");
		merge(C, D);

		int[] E = { -3, -1, 0, 29358, 29359, 300000 };
		int[] F = { -29, -2, 0, 100, 29360 };
		System.out.println("Test 3: ");
		merge(E, F);

	}
}
