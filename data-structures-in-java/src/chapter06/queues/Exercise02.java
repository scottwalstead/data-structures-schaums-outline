package chapter06.queues;

import java.io.ObjectInputStream.GetField;
import java.util.*;
import java.util.stream.*;

/** Exercise 6.02
 * @author Mr. Leo Nataj
  * Data Structures with Java, Second Edition, John R. Hubbard,
 * Schaum’s Outline Series
 */


public class Exercise02 {

	public static void main(String[] args) {
		Queue<String> q = new LinkedList<String>();
		Collections.addAll(q, "A", "B", "C", "D", "E", "F", "G", "H");
		System.out.printf("The original Queue is %s", q);
		Queue<String> r = reversed(q);
		System.out.printf("%n%nreversed Queue is %s", r);
	}
	
	/**  returns a new queue that contains the same elements as the given
	* queue, but in reversed order
	*/
	public static <E> Queue<E> reversed(Queue<E> queue) {
		LinkedList<E> list = queue.stream().collect(Collectors.toCollection(LinkedList::new)); // convert from Queue to LinkedList
		
		Iterator<E> it = list.descendingIterator();
		Queue<E> result = new ArrayDeque<>();
		
		while (it.hasNext()) {
			result.add(it.next());
		}
		
		return result;
		
	}
	
}
