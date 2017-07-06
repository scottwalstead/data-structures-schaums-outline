package chapter07.lists;

import java.util.*;
import java.util.stream.*;

/** Exercise 7.01
 * @author Mr. Leo Nataj
  * Data Structures with Java, Second Edition, John R. Hubbard,
 * Schaum’s Outline Series
 */
public class Exercise01 {
	public static void main(String[] args) {
		System.out.println(genRandomLetter());
	}
	
	/** fills list with n randomly generated capital letters
	 */
	
	public static void loadRandomLetters(LinkedList list, int n) {
		
		
	}
	
	public static char genRandomLetter() {
		Random ran = new Random();
		String alphabet = "abcdefghijklmnopqrstuvwxyz".toUpperCase();
		return alphabet.charAt(ran.nextInt(alphabet.length()));
	}
	
}

