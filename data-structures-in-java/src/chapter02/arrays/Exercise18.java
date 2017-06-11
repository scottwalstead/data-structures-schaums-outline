package chapter02.arrays;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**  Exercise 2.18
 * @author Leo Nataj
 * Data Structures with Java, Second Edition, John R. Hubbard,
 * Schaum’s Outline Series
 */

public class Exercise18 {

	public static void main(String[] args) {
		int[] prevRow = {1, 5, 10, 10, 5, 1};
		IntStream.range(0,7).forEach(i -> System.out.println(calcElement(i, prevRow)));
	}

	/** returns Pascal’s triangle of the given size
	
	public static int[][] pascal(int size) {
	/** int[][] result = new int[size][size];
	Stream.builder().
	for (int i=1; i<size; i++) {	
		int IntStream.range(0, i).map(i -> result[i-1][] - z[i]).toArray();
	}
	} */
	
	public static int calcElement(int index, int[] prevRow) {
		if (index>0 && index<prevRow.length) {
			return (prevRow[index-1] + prevRow[index]);
		} else {
			return 1;
		}
		
			
		}
	}

