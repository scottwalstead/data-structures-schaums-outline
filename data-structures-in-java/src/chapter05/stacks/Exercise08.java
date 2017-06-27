package chapter05.stacks;

import java.util.*;
import java.util.stream.*;

/** Exercise 5.08
 * @author Mr. Leo Nataj
  * Data Structures with Java, Second Edition, John R. Hubbard,
 * Schaum’s Outline Series
 */

public class Exercise08 {

	public static void main(String[] args) {
		Deque<String> stack = new ArrayDeque<String>();
		Collections.addAll(stack, "Jian", "Chao", "Feng", "Kim", "Linfoin");
		
		reversed(stack).forEach(System.out::println);

	}
	
	/** returns a new stack that contains the same elements as the given
	* stack, but in reversed order
	*/
	public static <E> Deque<E> reversed(Deque<E> stack) {
		List<E> list = stack.stream().collect(Collectors.toList());  // convert to list
		Collections.reverse(list);          // reverse the order by using java.util.Collections static methods
		return list.stream().collect(Collectors.toCollection(ArrayDeque::new));  // convert back to Deque
	}
		
}
