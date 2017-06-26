package chapter04.javacollectionsframework;

import java.util.*;

/** Exercise 4.02
 * @author Mr. Leo Nataj
  * Data Structures with Java, Second Edition, John R. Hubbard,
 * Schaum’s Outline Series
 */


public class Exercise02 {

	public static void main(String[] args) {
		List<Integer> testList = Arrays.asList(1, -2, 4, 5);
		print(testList);
	}

	/** prints all the elements of the collection c
	*/
	public static <T> void print(Collection<T> c) {
		c.stream().forEach(System.out::println);
	}
	
	
}
