package chapter06.queues;

import java.util.*;
import java.util.stream.*;
/** Exercise 6.05
 * @author Mr. Leo Nataj
  * Data Structures with Java, Second Edition, John R. Hubbard,
 * Schaum�s Outline Series
 */
public class Exrecise05 {

	public static void main(String[] args) {
		Queue<String> q = new LinkedList<>();
		Collections.addAll(q, "A", "B", "C", "D", "E", "F", "G", "H");
		System.out.printf("the second element is: %n%s", secondElement(q));
		
	}
	
	/**  returns the second element in the specified queue, leaving the
	 * queue in its original state
	 */
	public static <E> E secondElement(Queue<E> queue) {
		LinkedList<E> list = queue.stream().collect(Collectors.toCollection(LinkedList::new)); // convert from Queue to LinkedList
		
		return list.get(1);
		
	}

}
