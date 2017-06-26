package chapter04.javacollectionsframework;

import java.util.*;

/** Exercise 4.03
 * @author Mr. Leo Nataj
  * Data Structures with Java, Second Edition, John R. Hubbard,
 * Schaum’s Outline Series
 */

public class Exercise03 {

	public static void main(String[] args) {
		List<String> testList = Arrays.asList("james", "john", "james", "anishtosh", "singh", "Chao");
		System.out.printf("Number of occrance of %s is %n%d", "singh", frequency(testList, "singh"));

	}

	/** returns the number of occurrences of e in c
	*/
	public static <E> int frequency(Collection<E> c, E e) {
		return c.stream().mapToInt(s -> (s.equals(e))? 1:0).sum();
	}
}
