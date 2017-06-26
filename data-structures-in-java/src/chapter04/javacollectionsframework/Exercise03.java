package chapter04.javacollectionsframework;

import java.util.*;

/** Exercise 4.03
 * @author Mr. Leo Nataj
  * Data Structures with Java, Second Edition, John R. Hubbard,
 * Schaum’s Outline Series
 */

public class Exercise03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/** returns the number of occurrences of e in c
	*/
	public static <E> int frequency(Collection<E> c, E e) {
		return (int) c.stream().filter(s -> s.equals(e)).count();
	}
}
