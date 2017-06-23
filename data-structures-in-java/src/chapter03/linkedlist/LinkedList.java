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
		// Insert lines 2-14 of Example 3.12 on page 58
	}

	public void delete(int x) {
		// Insert lines 2-18 of Example 3.13 on page 59
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
