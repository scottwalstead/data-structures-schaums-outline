package chapter02.arrays;

import java.util.Arrays;
import java.util.stream.Stream;



/**  Exercise 2.15
 * @author Leo Nataj
 * Data Structures with Java, Second Edition, John R. Hubbard,
 * Schaum’s Outline Series
 */

public class Exercise15 {

	public static void main(String[] args) {
		double[] x = {0.1, 0.2, 0.4, 0.0};
		double[] y = {1.0, 1.0, -4.0, 15.0};
		System.out.printf("The outer product is equal to: %n");
	
		Stream.of(outerProduct(x, y))
			.forEach(s -> System.out.println(Arrays.toString(s)));

	}
	
	/** returns the algebraic outer product of the two given arrays
	* as (algebraic) vectors: p[i][j] = a[i]*b[j]
	*/
	public static double[][] outerProduct(double[] x, double[] y) {
		double[][] result = new double[x.length][y.length]; // declaration and instantiation
		for (int i=0; i<x.length; i++) {
			for (int j=0; j<y.length; j++) {
				result[i][j] = x[i]*y[j];
			}
		}
		return result;
	}

}
