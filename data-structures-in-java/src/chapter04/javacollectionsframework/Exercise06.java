package chapter04.javacollectionsframework;
import java.util.*;
import java.util.stream.*;

/** Exercise 4.06
 * @author Mr. Leo Nataj
  * Data Structures with Java, Second Edition, John R. Hubbard,
 * Schaum’s Outline Series
 */

public class Exercise06 {

	public static void main(String[] args) {
		String[] testArray =  {"james", "john", "james", "anishtosh", "singh", "Chao"};

		toCollection(testArray).forEach(System.out::println);
	}
	
	/** returns a generic Collection that contains the elements
	* of the specified array
	*/
	public static <E> Collection<E> toCollection(E[] a) {
		return Stream.of(a).collect(Collectors.toList());
	}
	
	
}
