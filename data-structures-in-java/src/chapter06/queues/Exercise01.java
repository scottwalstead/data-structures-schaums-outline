package chapter06.queues;

import java.util.*;

/** Exercise 6.01
 * @author Mr. Leo Nataj
  * Data Structures with Java, Second Edition, John R. Hubbard,
 * Schaum’s Outline Series
 */

public class Exercise01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<String> q = new LinkedList<String>();
		
		q.add("A");
		System.out.println(q);
		q.add("B");
		System.out.println(q);
		q.add("C");
		System.out.println(q);
		
		q.remove();
		System.out.println(q);
		q.remove();
		System.out.println(q);
		
		q.add("D");
		System.out.println(q);
		q.add("E");
		System.out.println(q);
		q.add("F");
		System.out.println(q);
		q.remove();
		System.out.println(q);
		
		q.add("G");
		System.out.println(q);
		q.remove();
		System.out.println(q);
		q.remove();
		System.out.println(q);
		q.remove();
		System.out.println(q);
	}
	
}
