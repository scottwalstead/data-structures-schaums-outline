/**
 * 
 */
package chapter02.arrays;
import java.util.Arrays;
import java.util.stream.*;

/**  Exercise 2.13
 * @author Leo Nataj
 * Data Structures with Java, Second Edition, John R. Hubbard,
 * Schaum’s Outline Series
 */

public class Exercise13 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(tally("abda")));

	}
	
	/** returns an array a[] of 26 integers that count the frequencies
	* of the (case insensitive) letters in the given string
	*/
	public static int[] tally(String string) {
		char[] charArray = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		int[] result = new int[26];
		for (int i=0; i<26; i++) {
			char ch = charArray[i];
			result[i] = (int) string.chars().filter(s -> s == ch).count();
		}
		return result;
	}

}
