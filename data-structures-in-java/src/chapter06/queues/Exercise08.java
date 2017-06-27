package chapter06.queues;
import java.util.*;
import java.util.stream.*;

/** Exercise 6.08
 * @author Mr. Leo Nataj
  * Data Structures with Java, Second Edition, John R. Hubbard,
 * Schaum’s Outline Series
 */
public class Exercise08 {
	public static void main(String[] args) {
		Queue<String> q1 = new LinkedList<>();
		Collections.addAll(q1, "A", "B", "C", "D", "E", "F", "G", "H");
		Queue<String> q2 = new LinkedList<>();
		Collections.addAll(q2, "I", "J", "K", "L", "M", "N", "O", "P");
		System.out.println(merge(q1, q2));
	}
	
	/**  returns a new queue that contains the same elements as the two
	 * specified queues, alternately merged together, leaving the two
	 * specified queues in their original state
	 */
	
	public static <E> Queue<E> merge(Queue<E> q1, Queue<E> q2) {
		return Stream.concat(q1.stream(), q2.stream())   // merging two streams
				.collect(Collectors.toCollection(LinkedList::new));  // converting to Queue
	}
}
