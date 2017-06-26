package chapter04.javacollectionsframework;
import java.util.Arrays;
import java.util.List;

/** Exercise 4.04
 * @author Mr. Leo Nataj
  * Data Structures with Java, Second Edition, John R. Hubbard,
 * Schaum’s Outline Series
 */

public class Exercise05 {

	public static void main(String[] args) {
		List<String> testList = Arrays.asList("james", "john", "james", "anishtosh", "singh", "Chao");
		int index = 4;
		System.out.printf("The element at index %d is %s", index , getElementAt(testList, index));

	}

	/** // returns the list element at the specified index
	*/
	public static <E> E getElementAt(List<E> list, int index) {
		return list.get(index);
	}
}