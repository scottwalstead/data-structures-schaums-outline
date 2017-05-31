package chapter02.arrays;

import java.util.stream.*;

public class Exercise08 {

	public static void main(String[] args) {
		double[] x = {2, 4, 6, 8};
		System.out.println(mean(x));

	}
	
	/** returns the average value 
	 of all the elements in a[]
	 */
	public static double mean(double[] a) {
		return DoubleStream.of(a)
				.average().getAsDouble();
	}

}
