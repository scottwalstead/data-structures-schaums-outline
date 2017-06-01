package chapter02.arrays;


import java.util.Random;

/**  Exercise 2.12
 * @author Leo Nataj
 * Data Structures with Java, Second Edition, John R. Hubbard,
 * Schaum’s Outline Series
 */

public class Exercise12 {

	public static void main(String[] args) {
		String[] y = {"But", "it", "is", "Alright"};

		System.out.println(shuffle(y));
	}

	/** randomly permutes the elements of a[]
	 */
	
	public static <T> T shuffle(T[] array) {
        Random rand = new Random();
        int index = rand.nextInt(array.length);
        return array[index];
    }
}
