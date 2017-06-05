package chapter02.arrays;

import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;


/**  Exercise 2.143
 * @author Leo Nataj
 * Data Structures with Java, Second Edition, John R. Hubbard,
 * Schaum’s Outline Series
 */

public class Exercise14 {

	public static void main(String[] args) {
		double[] x = {0.1, 0.2, 0.4, 0.0};
		double[] y = {1.0, 1.0, -4.0, 15.0};
		System.out.printf(String.format("The innre product is equal to: %f", innerProduct(x, y)));

	}
	
	/** returns the algebraic inner product (the sum of the component-
	* wise products) of the two given arrays as (algebraic) vectors
	*/
	public static double innerProduct(double[] x, double[] y) {
		return IntStream.range(0, x.length-1).mapToDouble(s -> x[s]*y[s]).sum();
	}
}
