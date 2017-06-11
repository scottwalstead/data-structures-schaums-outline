package chapter02.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntSupplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**  Exercise 2.18
 * @author Leo Nataj
 * Data Structures with Java, Second Edition, John R. Hubbard,
 * Schaum’s Outline Series
 */

public class Exercise18 {

	public static void main(String[] args) {
		int[][] result = pascal(11);
		for (int[] row:result) {
			System.out.println(Arrays.toString(row));
		}
	}

	/** returns Pascal’s triangle of the given size
	*/
	public static int[][] pascal(int size) {
	int[][] pascalTri = new int[size][];
		for (int i=0; i<size; i++) {
			pascalTri[i] = new int[i+1];
			Arrays.fill(pascalTri[i], 0, i+1, 1);
		}
		
		for (int i=2; i<size; i++) {
			for (int j=1; j<i; j++) {
				pascalTri[i][j] = calcElement(j, pascalTri[i-1]);
			}
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

