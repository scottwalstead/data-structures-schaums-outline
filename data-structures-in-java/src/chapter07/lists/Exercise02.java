package chapter07.lists;

import java.util.*;

/** Exercise 7.02
 * @author Mr. Leo Nataj
  * Data Structures with Java, Second Edition, John R. Hubbard,
 * Schaum’s Outline Series
 */

public class Exercise02 {
	public static void main(String[] args) {
		List<Integer> sample = Arrays.asList(1, 14, -2, 6, 78, 9);
		printList(sample);
		
	}
	
	/** a method that uses an iterator to print 
	 * the contents of a linked list, one object per line
	 */
	
	public static <T> void printList(List<T> list) {
		list.forEach(System.out::println);
	}
	
}

