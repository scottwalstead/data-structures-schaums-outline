package chapter02.arrays;

import java.util.Arrays;
import java.util.function.IntSupplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**  Exercise 2.18
 * @author Leo Nataj
 * Data Structures with Java, Second Edition, John R. Hubbard,
 * Schaum’s Outline Series
 */

public class Exercise18 {

	public static void main(String[] args) {
		
	}

	/** returns Pascal’s triangle of the given size
	*/
	public static int[][] pascal(int size) {
	int[][] pascalTri = new int[size][size];
	pascalTri[0][0] = 1;
	pascalTri[0][0] = 1;
	pascalTri[1][0] = 1;	
	for (int i=2; i<size; i++) {	
		int elementIndex = i;
		pascalTri[i]= IntStream.generate(
				() -> calcElement(elementIndex, pascalTri[elementIndex-1]))
				.toArray()
				.clone();
	}
	return pascalTri;
	
	} 
	
	public static int calcElement(int index, int[] prevRow) {
		if (index>0 && index<prevRow.length) {
			return (prevRow[index-1] + prevRow[index]);
		} else {
			return 1;
		}
		
			
		}
	}

