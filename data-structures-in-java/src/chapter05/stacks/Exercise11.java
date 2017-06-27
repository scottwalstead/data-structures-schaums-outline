package chapter05.stacks;

import java.util.*;
import java.util.stream.*;


/** Exercise 5.11
 * @author Mr. Leo Nataj
  * Data Structures with Java, Second Edition, John R. Hubbard,
 * Schaum’s Outline Series
 */


public class Exercise11 {

	public static void main(String[] args) {
		Deque<String> stack = new ArrayDeque<String>();
		Collections.addAll(stack, "Jian", "Chao", "Feng", "Kim", "Linfoin", "Shawander");

		System.out.println(penultimate(stack));
	}

	/** returns the second from the top element of the specified stack
	*/
	public static <E> E penultimate(Deque<E> stack) {
		List<E> list = stack.stream().collect(Collectors.toList());
		return list.get(list.size()-2);
	}
	
}
