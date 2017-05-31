/**
 * 
 */
package chapter02.arrays;

import java.awt.font.NumericShaper.Range;
import java.util.Arrays;
import java.util.stream.IntStream;

	  /**Exercise 2.10
	  * @author Leo Nataj
	  * Data Structures with Java, Second Edition, John R. Hubbard, 
	  * Schaum’s Outline Series
	  * @author Leo Nataj
	  */
public class Exercise10 {

	
	public static void main(String[] args) {
		int[] x = {2, 4, 5, -3, 1, 14, 15};
		System.out.println(Arrays.toString(reverse(x)));

	}
	
	/** reverses the elements of a[]
	 * @param args
	 */
	public static int[] reverse(int[] a) {
		return IntStream.range(0, a.length)
		.map(s -> a.length-s-1).map(s -> a[s]).toArray();
	}
}
