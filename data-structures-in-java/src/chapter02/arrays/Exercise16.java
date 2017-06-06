package chapter02.arrays;

import java.util.stream.*;

/**  Exercise 2.16
 * @author Leo Nataj
 * Data Structures with Java, Second Edition, John R. Hubbard,
 * Schaum’s Outline Series
 */

public class Exercise16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	/** returns the matrix product of the two given arrays a matrix:
	* p[i][j] = Sum(a[i][k]*b[k][j]:k)
	* Assuming result[m X m] = a[m X n] * b[n X m]
	*/
	
	public static double[][] product(double[][] a, double[][] b)  {
		int m = a.length;
		double[][] result = new double[m][m]; // declaration and instantiation
		for (int i=0; i<m; i++) {
			for (int j=0; j<m; j++) {
				double[] p = new double[m];
				double[] q = new double[m];
				for (int k=0; k<m; k++) {
					p[k] = a[i][k];
					q[k] = b[k][j];
				}
 				result[i][j] = IntStream.range(0, m-1).mapToDouble(s -> p[s]*q[s]).sum();
			}
		}
		return result;

		
	}

}
