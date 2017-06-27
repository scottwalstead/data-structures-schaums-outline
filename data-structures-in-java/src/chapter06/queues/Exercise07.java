package chapter06.queues;
import java.util.*;
import java.util.stream.*;
/** Exercise 6.06
 * @author Mr. Leo Nataj
  * Data Structures with Java, Second Edition, John R. Hubbard,
 * Schaum’s Outline Series
 */
public class Exercise07 {
	public static void main(String[] args) {
		Queue<String> q = new LinkedList<>();
		Collections.addAll(q, "A", "B", "C", "D", "E", "F", "G", "H");
		System.out.printf("Original queue is: %n%s", q);

		System.out.printf("%nNew queue is: %n%s", removeLastElement(q));
	}
	
	/**  removes the last element in the specified queue
	 */
	public static <E> Queue<E> removeLastElement(Queue<E> queue) {
		LinkedList<E> list = queue.stream().collect(Collectors.toCollection(LinkedList::new)); // convert from Queue to LinkedList
		return list.subList(0, list.size()-1).stream()
		.collect(Collectors.toCollection(LinkedList::new));
	}
}
