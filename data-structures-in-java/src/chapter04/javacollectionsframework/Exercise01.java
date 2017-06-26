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
		List<String> testString = Arrays.asList("One", "of", "us", "cels");
		System.out.printf("The number of characters in all strings is:%n%d", chars(testString));

	}
	
	/** returns the total number of characters in all the strings.
	*/
	public static int chars(List<String> strs) {
		return strs.stream().mapToInt(s -> s.toCharArray().length).sum();
	}
	
}
