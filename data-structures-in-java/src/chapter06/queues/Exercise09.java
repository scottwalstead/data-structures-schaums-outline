package chapter06.queues;
import java.util.*;
import java.util.stream.*;

/** Exercise 6.09
 * @author Mr. Leo Nataj
  * Data Structures with Java, Second Edition, John R. Hubbard,
 * Schaum’s Outline Series
 */
public class Exercise09 {
	public static void main(String[] args) {
		Queue<String> q = new LinkedList<>();
		Collections.addAll(q, "A", "B", "C", "D", "E", "F", "G", "H");
		
		System.out.printf("The reversed queue is%n%s", reverse(q));
	}
	
	/** reverses the contents of this queue
	 */
	
	public static <E> Queue<E> reverse(Queue<E> q) {
		LinkedList<E> list = q.stream().collect(Collectors.toCollection(LinkedList::new));
		
		Queue<E> result = new LinkedList<>();
		ListIterator<E> litr = list.listIterator(list.size());
				
		while (litr.hasPrevious()) {
			result.add(litr.previous());
		}
		return result;
		
	}
	
}
