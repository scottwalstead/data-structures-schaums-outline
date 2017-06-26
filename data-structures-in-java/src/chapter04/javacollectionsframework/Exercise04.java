package chapter04.javacollectionsframework;
import java.util.*;

/** Exercise 4.04
 * @author Mr. Leo Nataj
  * Data Structures with Java, Second Edition, John R. Hubbard,
 * Schaum’s Outline Series
 */

public class Exercise04 {

	public static void main(String[] args) {
		List<String> testList = Arrays.asList("james", "john", "james", "anishtosh", "singh", "Chao");
		System.out.println("Last element is " + getLast(testList));

	}

	/** // returns the last element of the list
	*/
	public static <E> E getLast(List<E> list) {
		return list.get(list.size()-1);
	}
}
