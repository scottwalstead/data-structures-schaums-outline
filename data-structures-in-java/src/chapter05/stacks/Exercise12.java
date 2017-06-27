package chapter05.stacks;
import java.util.*;
import java.util.stream.*;


/** Exercise 5.12
 * @author Mr. Leo Nataj
  * Data Structures with Java, Second Edition, John R. Hubbard,
 * Schaum’s Outline Series
 */



public class Exercise12 {

	public static void main(String[] args) {
		Deque<String> stack = new ArrayDeque<String>();
		Collections.addAll(stack, "Jian", "Chao", "Feng", "Kim", "Linfoin", "Shawander");

		System.out.println(popPenultimate(stack));

	}
	
	/** removes and returns the second element of the specified stack
	*/
	public static <E> E popPenultimate(Deque<E> stack) {
		List<E> list = stack.stream().limit(2).skip(1).collect(Collectors.toList());
		return list.get(0);
	}

}
