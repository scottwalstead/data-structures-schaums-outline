/**
 * 
 */
package chapter02.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


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
		// testInteger();
		String[] x = {"She", "is", "mad"};
		String[] y = {"But", "it", "is", "Alright"};
		String[] result = concatenate(x, y);
		System.out.println(Arrays.toString(result));
		
	}
	
	
	
	
	public static void testInteger() {
		Integer[] x = {2, 4, 3, 5};
		Integer[] y = {-2, 14, 3, 5};
		Integer[] result = concatenate(x, y);
		System.out.println(Arrays.toString(result));
	}
	/** returns an array containing all of a[] 
	 * followed by all of b[]
	 */
	@SafeVarargs
	public static <T> T[] concatenate(T[]... arrays) {
        ArrayList<T> result = new ArrayList<T>();
        for (T[] x : arrays)
            Collections.addAll(result, x);
        return (T[]) result.toArray(arrays[0].clone());
    }
	
	
}
