/**
 * 
 */
package chapter04.javacollectionsframework;
import java.util.*;

/** Exercise 4.01
 * @author Mr. Leo Nataj
  * Data Structures with Java, Second Edition, John R. Hubbard,
 * Schaum’s Outline Series
 */

public class Exercise01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	/** returns the total number of characters in all the strings.
	*/
	 
	public static int chars(List<String> strs) {
		return strs.stream().mapToInt(s -> s.split(s).length).sum();
	}

}
