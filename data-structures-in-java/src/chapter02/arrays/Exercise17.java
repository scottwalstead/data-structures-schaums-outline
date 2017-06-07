package chapter02.arrays;


/**  Exercise 2.14
 * @author Leo Nataj
 * Data Structures with Java, Second Edition, John R. Hubbard,
 * Schaum’s Outline Series
 */


public class Exercise17 {

	public static void main(String[] args) {
		Sample2DArray arr = new Sample2DArray(3, 2);
		arr.display();
		

	}

	/** returns the transpose of 
	 * the specified array as a matrix:
	 * ta[i][j] = a[j][i]
	 */
	public static double[][] transpose(double[][] a) {
		double[][] ta = new double[a[0].length][a.length];
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a[0].length; j++) {
				ta[i][j] = a[j][i];
			}
		}
		return ta;
	}
	
}
