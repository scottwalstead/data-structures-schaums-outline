/**
 * 
 */
package chapter03.linkedlist;

/**
 * @author Mr. Leo Nataj
  * Data Structures with Java, Second Edition, John R. Hubbard,
 * Schaum’s Outline Series
 */

public class LinkedList {

	private Node start;

	public void insert(int x) {
		// precondition: the list is in ascending order;
		// postconditions: the list is in ascending order, and it contains x;
		if (start == null || start.data > x) {
			start = new Node(x,start);
		}
		Node p=start;
		while (p.next != null) {
		if (p.next.data > x) break;
		p = p.next;
		}
		p.next = new Node(x,p.next);
	}

	public void delete(int x) {
		// precondition: the list is in ascending order;
		// postconditions: the list is in ascending order; 
		// it contains x, then the first occurrence of x has been deleted;
		if (start.data == x) { // x is the first element in the list
			start = start.next;
		}
		for (Node p = start; p.next != null; p = p.next) {
			if (p.next.data > x) {
				break; // x is not in the list
			} else if (p.next.data == x) { // x is in the p.next node
				p.next = p.next.next; // delete it
				break;
			}
		}
	}
	private static class Node {
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
		}
		public Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}
}
