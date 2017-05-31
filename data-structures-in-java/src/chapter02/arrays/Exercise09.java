package chapter02.arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Exercise09 {

	public static void main(String[] args) {
		int[] x = {7, 4, 4, 6, 2, 8, 6, 2};
		System.out.println(Arrays.toString(withoutDuplicates(x)));
		

	}
	
	// returns the specified array after removing all duplicates
	public static int[] withoutDuplicates(int[] a) {
		return IntStream.of(a)
				.distinct().toArray();
	}

}
