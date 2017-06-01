/**
 * 
 */
package chapter02.arrays;

import java.util.Arrays;
import java.util.stream.*;

/**  Exercise 2.11
 * @author Leo Nataj
 * Data Structures with Java, Second Edition, John R. Hubbard,
 * Schaum’s Outline Series
 */

public class Exercise11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer[] x = {2, 4, 3, 5};
		Integer[] y = {-2, 14, 3, 5};
		Integer[] result = (Integer[]) concatenate(x, y);
		
		System.out.println(Arrays.asList(result));

	}
	/** returns an array containing all of a[] 
	 * followed by all of b[]
	 */
	public static Object[] concatenate(Object[] a, Object[] b) {
		return Stream.of(a).toArray();
	}

}
