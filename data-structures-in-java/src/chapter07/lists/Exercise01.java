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
		List<Integer> sample = Arrays.asList(1, 14, -2, 6, 78, 9);
		loadRandomLetters(sample).forEach(System.out::println);
		
	}
	
	/** fills list with n randomly generated capital letters
	 */
	
	public static <T> List<Character> loadRandomLetters(List<T> list) {
		return Stream.generate(() -> genRandomLetter() )
				.limit(list.size())
				.collect(Collectors.toList());
	}
	
	public static char genRandomLetter() {
		Random ran = new Random();
		String alphabet = "abcdefghijklmnopqrstuvwxyz".toUpperCase();
		return alphabet.charAt(ran.nextInt(alphabet.length()));
	}
	
}

