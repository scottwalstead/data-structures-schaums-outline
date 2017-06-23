package chapter03.linkedlist;

/** Exercise 3.03
 * @author Mr. Leo Nataj
  * Data Structures with Java, Second Edition, John R. Hubbard,
 * Schaum’s Outline Series
 */


public class Exercise03 {

	public static void main(String[] args) {
		Node list = new Node(11);
		list.insert(22);
		for (int i = 1; i < 5; i++) {
			list.insert(22 + 11*i);
		}
		System.out.printf("The linkedlist has %d elements", size(list));
	}
	
	public static int size(Node list) {
	// returns: the number of nodes in the specified list;
	// For example, if list is {33, 55, 77, 99}, then size(list) will return 4.
		int sum = 0;
		while (list != null) {
		sum += list.data;
		list = list.next;
		}
		return sum;
	}
}
